package com.uncivildev.sliq.ide.highlight;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.core.lexer.SliqLexerAdapter;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import org.jetbrains.annotations.NotNull;

public class SliqSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};

    public static final TextAttributesKey BLOCK_KEYWORD =
            TextAttributesKey.createTextAttributesKey("BLOCK_KEYWORD", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
    private static final TextAttributesKey[] BLOCK_KEYWORDS = new TextAttributesKey[]{BLOCK_KEYWORD};

    public static final TextAttributesKey LOGICAL_OPERATOR =
            TextAttributesKey.createTextAttributesKey("LOGICAL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] LOGICAL_OPERATORS = new TextAttributesKey[]{LOGICAL_OPERATOR};

    public static final TextAttributesKey OPERATOR =
            TextAttributesKey.createTextAttributesKey("OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] OPERATORS = new TextAttributesKey[]{OPERATOR};

    public static final TextAttributesKey SYMBOL =
            TextAttributesKey.createTextAttributesKey("SYMBOL", DefaultLanguageHighlighterColors.COMMA);
    private static final TextAttributesKey[] SYMBOLS = new TextAttributesKey[]{SYMBOL};

    public static final TextAttributesKey LOCAL_VARIABLE =
            TextAttributesKey.createTextAttributesKey("VARIABLE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    private static final TextAttributesKey[] LOCAL_VARIABLES = new TextAttributesKey[]{LOCAL_VARIABLE};

    public static final TextAttributesKey GLOBAL_VARIABLE =
            TextAttributesKey.createTextAttributesKey("GLOBAL_VARIABLE", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    private static final TextAttributesKey[] GLOBAL_VARIABLES = new TextAttributesKey[]{GLOBAL_VARIABLE};

    public static final TextAttributesKey LIQUID_DELIMITER =
            TextAttributesKey.createTextAttributesKey("GLOBAL_VARIABLE", DefaultLanguageHighlighterColors.BRACES);
    private static final TextAttributesKey[] LIQUID_DELIMITERS = new TextAttributesKey[]{LIQUID_DELIMITER};

    public static final TextAttributesKey CONSTANT =
            TextAttributesKey.createTextAttributesKey("CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    private static final TextAttributesKey[] CONSTANTS = new TextAttributesKey[]{CONSTANT};

    public static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{COMMENT};

    public static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{STRING};

    public static final TextAttributesKey NUMBER =
            TextAttributesKey.createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[]{NUMBER};

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
        if (tokenType.equals(SliqTypes.ASSIGN) ||
                tokenType.equals(SliqTypes.CYCLE) ||
                tokenType.equals(SliqTypes.DOC) ||
                tokenType.equals(SliqTypes.ENDDOC) ||
                tokenType.equals(SliqTypes.ECHO) ||
                tokenType.equals(SliqTypes.RAW) ||
                tokenType.equals(SliqTypes.ENDRAW) ||
                tokenType.equals(SliqTypes.INCLUDE) ||
                tokenType.equals(SliqTypes.CONTENT_FOR) ||
                tokenType.equals(SliqTypes.LAYOUT) ||
                tokenType.equals(SliqTypes.RENDER) ||
                tokenType.equals(SliqTypes.SECTION) ||
                tokenType.equals(SliqTypes.SECTIONS) ||
                tokenType.equals(SliqTypes.INCREMENT) ||
                tokenType.equals(SliqTypes.DECREMENT)
        ) {
            return KEYWORDS;
        }


        if (tokenType.equals(SliqTypes.BREAK) ||
                tokenType.equals(SliqTypes.CAPTURE) ||
                tokenType.equals(SliqTypes.ENDCAPTURE) ||
                tokenType.equals(SliqTypes.CASE) ||
                tokenType.equals(SliqTypes.ENDCASE) ||
                tokenType.equals(SliqTypes.IF) ||
                tokenType.equals(SliqTypes.ELSE) ||
                tokenType.equals(SliqTypes.ELSIF) ||
                tokenType.equals(SliqTypes.ENDIF) ||
                tokenType.equals(SliqTypes.CONTINUE) ||
                tokenType.equals(SliqTypes.FOR) ||
                tokenType.equals(SliqTypes.ENDFOR) ||
                tokenType.equals(SliqTypes.FORM) ||
                tokenType.equals(SliqTypes.ENDFORM) ||
                tokenType.equals(SliqTypes.PAGINATE) ||
                tokenType.equals(SliqTypes.ENDPAGINATE) ||
                tokenType.equals(SliqTypes.JAVASCRIPT) ||
                tokenType.equals(SliqTypes.ENDJAVASCRIPT) ||
                tokenType.equals(SliqTypes.SCHEMA) ||
                tokenType.equals(SliqTypes.ENDSCHEMA) ||
                tokenType.equals(SliqTypes.STYLE) ||
                tokenType.equals(SliqTypes.ENDSTYLE) ||
                tokenType.equals(SliqTypes.STYLESHEET) ||
                tokenType.equals(SliqTypes.ENDSTYLESHEET) ||
                tokenType.equals(SliqTypes.TABLEROW) ||
                tokenType.equals(SliqTypes.ENDTABLEROW) ||
                tokenType.equals(SliqTypes.UNLESS) ||
                tokenType.equals(SliqTypes.ENDUNLESS) ||
                tokenType.equals(SliqTypes.WHEN) ||
                tokenType.equals(SliqTypes.WITH) ||
                tokenType.equals(SliqTypes.LIMIT) ||
                tokenType.equals(SliqTypes.LIQUID) ||
                tokenType.equals(SliqTypes.AS) ||
                tokenType.equals(SliqTypes.IN) ||
                tokenType.equals(SliqTypes.COLS) ||
                tokenType.equals(SliqTypes.OFFSET) ||
                tokenType.equals(SliqTypes.REVERSED) ||
                tokenType.equals(SliqTypes.BY)
        ) {
            return BLOCK_KEYWORDS;
        }

        if (tokenType.equals(SliqTypes.AND) ||
                tokenType.equals(SliqTypes.OR) ||
                tokenType.equals(SliqTypes.CONTAINS)
        ) {
            return LOGICAL_OPERATORS;
        }

        if (tokenType.equals(SliqTypes.EQ) ||
                tokenType.equals(SliqTypes.GE) ||
                tokenType.equals(SliqTypes.GT) ||
                tokenType.equals(SliqTypes.LE) ||
                tokenType.equals(SliqTypes.LT) ||
                tokenType.equals(SliqTypes.NE) ||
                tokenType.equals(SliqTypes.SET)
        ) {
            return OPERATORS;
        }

        if (tokenType.equals(SliqTypes.DOT) ||
                tokenType.equals(SliqTypes.COLON) ||
                tokenType.equals(SliqTypes.COMMA) ||
                tokenType.equals(SliqTypes.LBRACKET) ||
                tokenType.equals(SliqTypes.RBRACKET) ||
                tokenType.equals(SliqTypes.LPAREN) ||
                tokenType.equals(SliqTypes.RPAREN) ||
                tokenType.equals(SliqTypes.PIPE) ||
                tokenType.equals(SliqTypes.RANGE)
        ) {
            return SYMBOLS;
        }

        if (tokenType.equals(SliqTypes.LIQUID_OUTPUT_START) ||
                tokenType.equals(SliqTypes.LIQUID_OUTPUT_END) ||
                tokenType.equals(SliqTypes.LIQUID_TAG_START) ||
                tokenType.equals(SliqTypes.LIQUID_TAG_END)
        ) {
            return LIQUID_DELIMITERS;
        }

        if (tokenType.equals(SliqTypes.BLANK) ||
                tokenType.equals(SliqTypes.EMPTY) ||
                tokenType.equals(SliqTypes.NIL) ||
                tokenType.equals(SliqTypes.FALSE) ||
                tokenType.equals(SliqTypes.TRUE)
        ) {
            return CONSTANTS;
        }

        if (tokenType.equals(SliqTypes.FILTER_KWD)) {
            return CONSTANTS;
        }

        if (tokenType.equals(SliqTypes.IDENTIFIER)) {
            return LOCAL_VARIABLES;
        }

        if (tokenType.equals(SliqTypes.COMMENT) ||
                tokenType.equals(SliqTypes.ENDCOMMENT) ||
                tokenType.equals(SliqTypes.HASH)
        ) {
            return COMMENTS;
        }

        if (tokenType.equals(SliqTypes.STRING_LITERAL)) {
            return STRINGS;
        }

        if (tokenType.equals(SliqTypes.NUMBER)) {
            return NUMBERS;
        }

        return TEMPLATES;
    }
}
