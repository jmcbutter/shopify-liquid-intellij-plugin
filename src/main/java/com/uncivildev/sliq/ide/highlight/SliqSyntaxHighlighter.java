package com.uncivildev.sliq.ide.highlight;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.core.lexer.SliqLexerAdapter;
import com.uncivildev.sliq.lang.core.psi.SliqTokenSets;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import org.jetbrains.annotations.NotNull;

public class SliqSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey LIQUID_DELIMITER =
            TextAttributesKey.createTextAttributesKey("SLIQ_LIQUID_DELIMITER", DefaultLanguageHighlighterColors.BRACES);
    private static final TextAttributesKey[] LIQUID_DELIMITER_KEYS = new TextAttributesKey[]{LIQUID_DELIMITER};

    public static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("SLIQ_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};

    public static final TextAttributesKey TEMPLATE =
            TextAttributesKey.createTextAttributesKey("SLIQ_TEMPLATE", DefaultLanguageHighlighterColors.TEMPLATE_LANGUAGE_COLOR);
    private static final TextAttributesKey[] TEMPLATE_KEYS = new TextAttributesKey[]{TEMPLATE};

    @NotNull
    @Override
    public SliqLexerAdapter getHighlightingLexer() {
        return new SliqLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (SliqTokenSets.IDENTIFIERS.contains(tokenType)) {
            return KEYWORD_KEYS;
        }

        if (SliqTokenSets.DELIMITERS.contains(tokenType)) {
            return LIQUID_DELIMITER_KEYS;
        }
        return TEMPLATE_KEYS;
    }
}
