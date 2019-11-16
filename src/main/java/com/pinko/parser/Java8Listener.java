package com.pinko.parser;// Generated from Java8.g4 by ANTLR 4.5

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Java8Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Java8Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(Java8Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(Java8Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(Java8Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(Java8Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java8Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Java8Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Java8Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(Java8Parser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(Java8Parser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(Java8Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(Java8Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java8Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java8Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java8Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java8Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(Java8Parser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(Java8Parser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(Java8Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(Java8Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(Java8Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(Java8Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(Java8Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(Java8Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java8Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java8Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(Java8Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(Java8Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(Java8Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(Java8Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(Java8Parser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(Java8Parser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(Java8Parser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(Java8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(Java8Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(Java8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(Java8Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(Java8Parser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(Java8Parser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(Java8Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(Java8Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(Java8Parser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(Java8Parser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(Java8Parser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(Java8Parser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(Java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(Java8Parser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(Java8Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(Java8Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Java8Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Java8Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java8Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(Java8Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(Java8Parser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(Java8Parser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(Java8Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Java8Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Java8Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(Java8Parser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(Java8Parser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Java8Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Java8Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(Java8Parser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(Java8Parser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(Java8Parser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(Java8Parser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(Java8Parser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(Java8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(Java8Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(Java8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(Java8Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Java8Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Java8Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Java8Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Java8Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(Java8Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(Java8Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(Java8Parser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(Java8Parser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java8Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java8Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java8Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java8Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(Java8Parser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(Java8Parser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(Java8Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(Java8Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(Java8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(Java8Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java8Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java8Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(Java8Parser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(Java8Parser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java8Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java8Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Java8Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Java8Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Java8Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(Java8Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(Java8Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(Java8Parser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(Java8Parser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(Java8Parser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(Java8Parser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java8Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java8Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(Java8Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Java8Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java8Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(Java8Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(Java8Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(Java8Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(Java8Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(Java8Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(Java8Parser.LeftHandSideContext ctx);

	//TODO
	String getExtension();
}