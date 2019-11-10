package com.pinko;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Very basic Java to Swift syntax converter.
 * See test/Test.java and test/Test.swift for an idea of what this produces.
 * This is a work in progress...
 *
 * TODO:
 *  Class (static) method invocations should be qualified.
 *  Method and fields with the same name should be disambiguated.
 *  Final vars should become "let" vars.
 *
 * @author Pat Niemeyer (pat@pat.net)
 */
public class SwiftInterfaceListener extends JavaInterfaceBaseListener
{
    CommonTokenStream tokens;

    boolean inConstructor;
    int formalParameterPosition;

    // Some basic type mappings
    static Map<String,String> typeMap = new HashMap<>();
    static {
        typeMap.put("float", "Float");
        typeMap.put("Float", "Float");
        typeMap.put("int", "Int");
        typeMap.put("Integer", "Int");
        typeMap.put("long", "Int64");
        typeMap.put("Long", "Int64");
        typeMap.put("boolean", "Bool");
        typeMap.put("Boolean", "Bool");
        typeMap.put("Map", "Dictionary");
        typeMap.put("HashSet", "Set");
        typeMap.put("HashMap", "Dictionary");
        typeMap.put("List", "Array");
        typeMap.put("ArrayList", "Array");
    }

    // Some basic modifier mappings (others in context)
    static Map<String,String> modifierMap = new HashMap<>();
    static {
        modifierMap.put("protected", "internal");
        modifierMap.put("volatile", "/*volatile*/");
    }

    public SwiftInterfaceListener(CommonTokenStream tokens )
    {
        this.tokens = tokens;
        this.rewriter = new TokenStreamRewriter( tokens );
    }

    JavaInterfaceParser.UnannTypeContext unannType;

    @Override public void enterConstantDeclaration( JavaInterfaceParser.ConstantDeclarationContext ctx ) {
        //:	constantModifier* unannType variableDeclaratorList ';'
        unannType = ctx.unannType();
    }
    @Override public void exitConstantDeclaration( JavaInterfaceParser.ConstantDeclarationContext ctx ) {
        replace( ctx.unannType(), "var" );
        unannType = null;
    }

    @Override
    public void enterFormalParameterList( JavaInterfaceParser.FormalParameterListContext ctx )
    {
        // called from methodDeclarator
        //:	formalParameters ',' lastFormalParameter
        //    |	lastFormalParameter
        formalParameterPosition = 0;
    }

    @Override
    public void enterFormalParameters( JavaInterfaceParser.FormalParametersContext ctx )
    {
        // called from formalParameterList
        //:	formalParameter (',' formalParameter)*
        //    |	receiverParameter (',' formalParameter)*
        formalParameterPosition = 0;
    }

    @Override
    public void exitFormalParameter( JavaInterfaceParser.FormalParameterContext ctx )
    {
        rewriter.insertAfter( ctx.variableDeclaratorId().stop, " : " + getText( ctx.unannType() ) );

        //:	variableModifier* unannType variableDeclaratorId
        if ( formalParameterPosition++ > 0 || inConstructor ) {
            replace( ctx.unannType(), "_" );
        } else {
            removeRight( ctx.unannType() );
        }
    }

    @Override
    public void exitMethodHeader( JavaInterfaceParser.MethodHeaderContext ctx )
    {
        //:	result methodDeclarator throws_?
        //|	typeParameters annotation* result methodDeclarator throws_?
        if ( !ctx.result().getText().equals( "void" )) {
            rewriter.insertAfter( ctx.methodDeclarator().stop, " -> " + getText( ctx.result() ) );
        }
        replace( ctx.result(), "func" );
    }

    @Override
    public void enterPackageDeclaration( JavaInterfaceParser.PackageDeclarationContext ctx ) {
        rewriter.insertBefore( ctx.start, "// " );
    }

    @Override
    public void enterPrimaryNoNewArray_lfno_primary( JavaInterfaceParser.PrimaryNoNewArray_lfno_primaryContext ctx ) {
        if ( ctx.getText().equals( "this" )) { replace( ctx, "self" ); }
    }

    @Override
    public void enterLiteral( JavaInterfaceParser.LiteralContext ctx )
    {
        //IntegerLiteral
        //        |	FloatingPointLiteral
        //        |	BooleanLiteral
        //        |	CharacterLiteral
        //        |	StringLiteral
        //        |	NullLiteral
        if ( ctx.getText().equals( "null" ) ) {
            replace(ctx, "nil");
        } else
        if ( ctx.FloatingPointLiteral() != null ) {
            String text = ctx.getText();
            if ( text.toLowerCase().endsWith( "f" ) ) {
                text = text.substring( 0, text.length()-1 );
                replace(ctx, text);
            }
        }
    }


    @Override
    public void exitClassInstanceCreationExpression( JavaInterfaceParser.ClassInstanceCreationExpressionContext ctx )
    {
        //:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
        //|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
        //|	primary '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
        if ( ctx.start.getText().equals( "new" ) ) {
            replaceFirst( ctx, Java8Lexer.Identifier, mapType(ctx.Identifier().get(0).getText()) );
            rewriter.delete( ctx.start );
            rewriter.delete( ctx.start.getTokenIndex() + 1 ); // space
        }
    }

    @Override
    public void enterClassInstanceCreationExpression_lfno_primary( JavaInterfaceParser.ClassInstanceCreationExpression_lfno_primaryContext ctx )
    {
        //:	'new' typeArguments? annotation* Identifier ('.' annotation* Identifier)* typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
        //|	expressionName '.' 'new' typeArguments? annotation* Identifier typeArgumentsOrDiamond? '(' argumentList? ')' classBody?
        if ( ctx.start.getText().equals( "new" ) ) {
            replaceFirst( ctx, Java8Lexer.Identifier, mapType(ctx.Identifier().get(0).getText()) );
            rewriter.delete( ctx.start );
            rewriter.delete( ctx.start.getTokenIndex() + 1 ); // space
        }
    }

    @Override
    public void exitUnannType( JavaInterfaceParser.UnannTypeContext ctx )
    {
        // mapping may already have been done by more specific rule but this shouldn't hurt it
        // todo: this needs to be more specific, preventing rewrites on generic type args
        //if ( !ctx.getText().contains( "<" ) && !ctx.getText().contains( "[" )) {
            replace( ctx, mapType( getText( ctx ) ) );
        //}
    }

    @Override
    public void exitArrayType( JavaInterfaceParser.ArrayTypeContext ctx ) {
        //:	primitiveType dims
        //|	classOrInterfaceType dims
        //|	typeVariable dims
        ParserRuleContext rule;
        if ( ctx.primitiveType() != null ) {
            rule = ctx.primitiveType();
        } else if ( ctx.classOrInterfaceType() != null ) {
            rule = ctx.classOrInterfaceType();
        } else {
            rule = ctx.typeVariable();
        }
        replace( ctx, "["+mapType(rule)+"]" );
    }

    @Override
    public void exitUnannArrayType( JavaInterfaceParser.UnannArrayTypeContext ctx ) {
        //:	unannPrimitiveType dims
        //|	unannClassOrInterfaceType dims
        //|	unannTypeVariable dims
        ParserRuleContext rule;
        if ( ctx.unannPrimitiveType() != null ) {
            rule = ctx.unannPrimitiveType();
        } else if ( ctx.unannClassOrInterfaceType() != null ) {
            rule = ctx.unannClassOrInterfaceType();
        } else {
            rule = ctx.unannTypeVariable();
        }
        replace( ctx, "["+mapType(rule)+"]" );
    }

    @Override
    public void enterImportDeclaration( JavaInterfaceParser.ImportDeclarationContext ctx )
    {
        rewriter.insertBefore( ctx.start, "// " );
    }
    @Override
    public void exitClassModifier( JavaInterfaceParser.ClassModifierContext ctx ) {
        replace( ctx, mapModifier( ctx ) );
    }

    @Override
    public void enterNormalInterfaceDeclaration( JavaInterfaceParser.NormalInterfaceDeclarationContext ctx )
    {
        //:	interfaceModifier* 'interface' Identifier typeParameters? extendsInterfaces? interfaceBody
        List<TerminalNode> intfTokens = ctx.getTokens( Java8Lexer.INTERFACE );
        rewriter.replace( intfTokens.get( 0 ).getSymbol().getTokenIndex(), "protocol" );
    }

    @Override
    public String getExtension() {
        //TODO
        return ".swift";
    }

    @Override
    public void exitUnannClassType_lfno_unannClassOrInterfaceType( JavaInterfaceParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx )
    {
        //unannClassType_lfno_unannClassOrInterfaceType
        //:	Identifier typeArguments?
        replaceFirst( ctx, ctx.Identifier().getSymbol().getType(), mapType( ctx.Identifier().getText() ) );
    }

    @Override
    public void exitTypeArgumentsOrDiamond( JavaInterfaceParser.TypeArgumentsOrDiamondContext ctx )
    {
        //:	typeArguments
        //        |	'<' '>'
        if ( ctx.typeArguments() == null ) {
            deleteFirst( ctx, Java8Lexer.GT );
            deleteFirst( ctx, Java8Lexer.LT );
        }
    }

    //
    // util
    //
    private void deleteFirst( ParserRuleContext ctx, int token ) {
        List<TerminalNode> tokens = ctx.getTokens( token );
        rewriter.delete( tokens.get(0).getSymbol().getTokenIndex() );
    }
    private void replaceFirst( ParserRuleContext ctx, int token, String str ) {
        List<TerminalNode> tokens = ctx.getTokens( token );
        if ( tokens == null || tokens.isEmpty() ) { return; }
        rewriter.replace( tokens.get( 0 ).getSymbol().getTokenIndex(), str );
    }


    // Get possibly rewritten text
    private String getText( ParserRuleContext ctx ) {
        if ( ctx == null ) { return ""; }
        return rewriter.getText( new Interval( ctx.start.getTokenIndex(), ctx.stop.getTokenIndex() ) );
    }

    private void replace( ParserRuleContext ctx, String s ) {
        rewriter.replace( ctx.start, ctx.stop, s );
    }

    // remove context and hidden tokens to right
    private void removeRight( ParserRuleContext ctx )
    {
        rewriter.delete( ctx.start, ctx.stop );
        List<Token> htr = tokens.getHiddenTokensToRight( ctx.stop.getTokenIndex() );
        for (Token token : htr) { rewriter.delete( token ); }
    }

    public String mapType( ParserRuleContext ctx )
    {
        //if ( ctx instanceof JavaInterfaceParser.UnannArrayTypeContext ) { }
        //String text = ctx.getText();
        String text = getText(ctx);
        return mapType( text );
    }
    public String mapType( String text )
    {
        String mapText = typeMap.get( text );
        return mapText == null ? text : mapText;
    }

    public String mapModifier( ParserRuleContext ctx )
    {
        //if ( ctx instanceof JavaInterfaceParser.UnannArrayTypeContext ) { }
        //String text = ctx.getText();
        String text = getText( ctx );
        return mapModifier( text );
    }
    public String mapModifier( String text )
    {
        String mapText = modifierMap.get( text );
        return mapText == null ? text : mapText;
    }
}

