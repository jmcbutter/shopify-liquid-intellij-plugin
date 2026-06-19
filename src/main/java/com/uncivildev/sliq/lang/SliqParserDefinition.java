package com.uncivildev.sliq.lang;

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
import com.uncivildev.sliq.lang.core.parser.SliqParser;
import com.uncivildev.sliq.lang.core.psi.SliqLiquidFile;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import org.jetbrains.annotations.NotNull;

public class SliqParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE = new IFileElementType(SliqLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new SliqLexerAdapter();
    }


    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
        // return SliqTokenSets.COMMENTS;
    }

    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new SliqParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new SliqLiquidFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return SliqTypes.Factory.createElement(node);
    }
}
