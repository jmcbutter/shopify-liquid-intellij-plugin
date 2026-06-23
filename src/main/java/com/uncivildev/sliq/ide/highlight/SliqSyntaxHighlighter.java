package com.uncivildev.sliq.ide.highlight;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.core.lexer.SliqLexerAdapter;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import org.jetbrains.annotations.NotNull;

public class SliqSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey SHOPIFY_OBJECT =
            TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    private static final TextAttributesKey[] SHOPIFY_OBJECTS = new TextAttributesKey[]{SHOPIFY_OBJECT};

    public static final TextAttributesKey TEMPLATE =
            TextAttributesKey.createTextAttributesKey("TEMPLATE", DefaultLanguageHighlighterColors.INLAY_TEXT_WITHOUT_BACKGROUND);
    private static final TextAttributesKey[] TEMPLATES = new TextAttributesKey[]{TEMPLATE};

    @NotNull
    @Override
    public SliqLexerAdapter getHighlightingLexer() {
        return new SliqLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return SHOPIFY_OBJECTS;
    }
}
