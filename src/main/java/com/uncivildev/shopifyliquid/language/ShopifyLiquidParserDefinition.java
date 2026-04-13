package com.uncivildev.shopifyliquid.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.uncivildev.shopifyliquid.language.parser.ShopifyLiquidParser;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidFile;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTokenSets;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import org.jetbrains.annotations.NotNull;

public class ShopifyLiquidParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(ShopifyLiquidLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new ShopifyLiquidLexerAdapter();
    }


    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
        // return ShopifyLiquidTokenSets.COMMENTS;
    }

    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new ShopifyLiquidParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new ShopifyLiquidFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return ShopifyLiquidTypes.Factory.createElement(node);
    }
}
