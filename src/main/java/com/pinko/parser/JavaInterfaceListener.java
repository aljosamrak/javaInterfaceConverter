package com.pinko.parser;// Generated from Java8.g4 by ANTLR 4.5

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaInterfaceParser}.
 */
public interface JavaInterfaceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaInterfaceParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaInterfaceParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaInterfaceParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaInterfaceParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaInterfaceParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaInterfaceParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(JavaInterfaceParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(JavaInterfaceParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(JavaInterfaceParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(JavaInterfaceParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(JavaInterfaceParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(JavaInterfaceParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaInterfaceParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaInterfaceParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaInterfaceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaInterfaceParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaInterfaceParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaInterfaceParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(JavaInterfaceParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(JavaInterfaceParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(JavaInterfaceParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(JavaInterfaceParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(JavaInterfaceParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(JavaInterfaceParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(JavaInterfaceParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(JavaInterfaceParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(JavaInterfaceParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(JavaInterfaceParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(JavaInterfaceParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(JavaInterfaceParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(JavaInterfaceParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(JavaInterfaceParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaInterfaceParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaInterfaceParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaInterfaceParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaInterfaceParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(JavaInterfaceParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(JavaInterfaceParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaInterfaceParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaInterfaceParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(JavaInterfaceParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(JavaInterfaceParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaInterfaceParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaInterfaceParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(JavaInterfaceParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(JavaInterfaceParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaInterfaceParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaInterfaceParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(JavaInterfaceParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(JavaInterfaceParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(JavaInterfaceParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(JavaInterfaceParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(JavaInterfaceParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(JavaInterfaceParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaInterfaceParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaInterfaceParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(JavaInterfaceParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(JavaInterfaceParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaInterfaceParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaInterfaceParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(JavaInterfaceParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(JavaInterfaceParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(JavaInterfaceParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(JavaInterfaceParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaInterfaceParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaInterfaceParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaInterfaceParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaInterfaceParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(JavaInterfaceParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(JavaInterfaceParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaInterfaceParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaInterfaceParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(JavaInterfaceParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(JavaInterfaceParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(JavaInterfaceParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(JavaInterfaceParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(JavaInterfaceParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(JavaInterfaceParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(JavaInterfaceParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(JavaInterfaceParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaInterfaceParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaInterfaceParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaInterfaceParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaInterfaceParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(JavaInterfaceParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(JavaInterfaceParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JavaInterfaceParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JavaInterfaceParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaInterfaceParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaInterfaceParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(JavaInterfaceParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(JavaInterfaceParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(JavaInterfaceParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(JavaInterfaceParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaInterfaceParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaInterfaceParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JavaInterfaceParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JavaInterfaceParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JavaInterfaceParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JavaInterfaceParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JavaInterfaceParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JavaInterfaceParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(JavaInterfaceParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(JavaInterfaceParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JavaInterfaceParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JavaInterfaceParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JavaInterfaceParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JavaInterfaceParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(JavaInterfaceParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(JavaInterfaceParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JavaInterfaceParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaInterfaceParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaInterfaceParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaInterfaceParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(JavaInterfaceParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(JavaInterfaceParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JavaInterfaceParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JavaInterfaceParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaInterfaceParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaInterfaceParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(JavaInterfaceParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(JavaInterfaceParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JavaInterfaceParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JavaInterfaceParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(JavaInterfaceParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(JavaInterfaceParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaInterfaceParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaInterfaceParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaInterfaceParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaInterfaceParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaInterfaceParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaInterfaceParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaInterfaceParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaInterfaceParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaInterfaceParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaInterfaceParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(JavaInterfaceParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(JavaInterfaceParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(JavaInterfaceParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(JavaInterfaceParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(JavaInterfaceParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(JavaInterfaceParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(JavaInterfaceParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(JavaInterfaceParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaInterfaceParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaInterfaceParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(JavaInterfaceParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(JavaInterfaceParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(JavaInterfaceParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(JavaInterfaceParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaInterfaceParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaInterfaceParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(JavaInterfaceParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(JavaInterfaceParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaInterfaceParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaInterfaceParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaInterfaceParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaInterfaceParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(JavaInterfaceParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(JavaInterfaceParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(JavaInterfaceParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(JavaInterfaceParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(JavaInterfaceParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(JavaInterfaceParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaInterfaceParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaInterfaceParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaInterfaceParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaInterfaceParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(JavaInterfaceParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(JavaInterfaceParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(JavaInterfaceParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(JavaInterfaceParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaInterfaceParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaInterfaceParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaInterfaceParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaInterfaceParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaInterfaceParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaInterfaceParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaInterfaceParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaInterfaceParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(JavaInterfaceParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(JavaInterfaceParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaInterfaceParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaInterfaceParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(JavaInterfaceParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(JavaInterfaceParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaInterfaceParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaInterfaceParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaInterfaceParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaInterfaceParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(JavaInterfaceParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(JavaInterfaceParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(JavaInterfaceParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(JavaInterfaceParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaInterfaceParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaInterfaceParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaInterfaceParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaInterfaceParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaInterfaceParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaInterfaceParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(JavaInterfaceParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(JavaInterfaceParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(JavaInterfaceParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(JavaInterfaceParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(JavaInterfaceParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(JavaInterfaceParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaInterfaceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaInterfaceParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(JavaInterfaceParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(JavaInterfaceParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaInterfaceParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaInterfaceParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaInterfaceParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaInterfaceParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(JavaInterfaceParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(JavaInterfaceParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JavaInterfaceParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JavaInterfaceParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaInterfaceParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaInterfaceParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaInterfaceParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaInterfaceParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(JavaInterfaceParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(JavaInterfaceParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaInterfaceParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaInterfaceParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(JavaInterfaceParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(JavaInterfaceParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaInterfaceParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaInterfaceParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaInterfaceParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaInterfaceParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(JavaInterfaceParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(JavaInterfaceParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(JavaInterfaceParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(JavaInterfaceParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(JavaInterfaceParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(JavaInterfaceParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(JavaInterfaceParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(JavaInterfaceParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaInterfaceParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaInterfaceParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(JavaInterfaceParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(JavaInterfaceParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(JavaInterfaceParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(JavaInterfaceParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaInterfaceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaInterfaceParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(JavaInterfaceParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(JavaInterfaceParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(JavaInterfaceParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(JavaInterfaceParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(JavaInterfaceParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(JavaInterfaceParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaInterfaceParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaInterfaceParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(JavaInterfaceParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(JavaInterfaceParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(JavaInterfaceParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(JavaInterfaceParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(JavaInterfaceParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(JavaInterfaceParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(JavaInterfaceParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(JavaInterfaceParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(JavaInterfaceParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(JavaInterfaceParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaInterfaceParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(JavaInterfaceParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaInterfaceParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(JavaInterfaceParser.LeftHandSideContext ctx);

	//TODO
	String getExtension();
}