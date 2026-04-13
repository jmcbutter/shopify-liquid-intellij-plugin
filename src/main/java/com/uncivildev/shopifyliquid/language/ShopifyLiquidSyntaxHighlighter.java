package com.uncivildev.shopifyliquid.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ShopifyLiquidSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey TAG_DELIMITER = createTextAttributesKey("SHOPIFYLIQUID_TAG_DELIMITER", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey TAG_KEYWORD = createTextAttributesKey("SHOPIFYLIQUID_TAG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING = createTextAttributesKey("SHOPIFYLIQUID_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("SHOPIFYLIQUID_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("SHOPIFYLIQUID_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("SHOPIFYLIQUID_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey FILTER = createTextAttributesKey("SHOPIFYLIQUID_FILTER", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("SHOPIFYLIQUID_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] TAG_DELIMITER_KEYS = new TextAttributesKey[]{TAG_DELIMITER};
    private static final TextAttributesKey[] TAG_KEYWORD_KEYS = new TextAttributesKey[]{TAG_KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] FILTER_KEYS = new TextAttributesKey[]{FILTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ShopifyLiquidLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(ShopifyLiquidTypes.LIQUID_TAG_START) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_TAG_START_STRIP) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_TAG_END) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_TAG_END_STRIP) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_OUTPUT_START) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_OUTPUT_START_STRIP) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_OUTPUT_END) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID_OUTPUT_END_STRIP)) {
            return TAG_DELIMITER_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.ASSIGN) ||
            tokenType.equals(ShopifyLiquidTypes.BREAK) ||
            tokenType.equals(ShopifyLiquidTypes.CAPTURE) ||
            tokenType.equals(ShopifyLiquidTypes.ENDCAPTURE) ||
            tokenType.equals(ShopifyLiquidTypes.CASE) ||
            tokenType.equals(ShopifyLiquidTypes.ENDCASE) ||
            tokenType.equals(ShopifyLiquidTypes.COMMENT) ||
            tokenType.equals(ShopifyLiquidTypes.ENDCOMMENT) ||
            tokenType.equals(ShopifyLiquidTypes.CONTINUE) ||
            tokenType.equals(ShopifyLiquidTypes.CYCLE) ||
            tokenType.equals(ShopifyLiquidTypes.DECREMENT) ||
            tokenType.equals(ShopifyLiquidTypes.ECHO) ||
            tokenType.equals(ShopifyLiquidTypes.ELSE) ||
            tokenType.equals(ShopifyLiquidTypes.ELSIF) ||
            tokenType.equals(ShopifyLiquidTypes.FOR) ||
            tokenType.equals(ShopifyLiquidTypes.ENDFOR) ||
            tokenType.equals(ShopifyLiquidTypes.FORM) ||
            tokenType.equals(ShopifyLiquidTypes.ENDFORM) ||
            tokenType.equals(ShopifyLiquidTypes.IF) ||
            tokenType.equals(ShopifyLiquidTypes.ENDIF) ||
            tokenType.equals(ShopifyLiquidTypes.IFCHANGED) ||
            tokenType.equals(ShopifyLiquidTypes.INCREMENT) ||
            tokenType.equals(ShopifyLiquidTypes.JAVASCRIPT) ||
            tokenType.equals(ShopifyLiquidTypes.ENDJAVASCRIPT) ||
            tokenType.equals(ShopifyLiquidTypes.LAYOUT) ||
            tokenType.equals(ShopifyLiquidTypes.LIQUID) ||
            tokenType.equals(ShopifyLiquidTypes.PAGINATE) ||
            tokenType.equals(ShopifyLiquidTypes.ENDPAGINATE) ||
            tokenType.equals(ShopifyLiquidTypes.RAW) ||
            tokenType.equals(ShopifyLiquidTypes.ENDRAW) ||
            tokenType.equals(ShopifyLiquidTypes.RENDER) ||
            tokenType.equals(ShopifyLiquidTypes.SCHEMA) ||
            tokenType.equals(ShopifyLiquidTypes.ENDSCHEMA) ||
            tokenType.equals(ShopifyLiquidTypes.SECTION) ||
            tokenType.equals(ShopifyLiquidTypes.SECTIONS) ||
            tokenType.equals(ShopifyLiquidTypes.STYLE) ||
            tokenType.equals(ShopifyLiquidTypes.ENDSTYLE) ||
            tokenType.equals(ShopifyLiquidTypes.STYLESHEET) ||
            tokenType.equals(ShopifyLiquidTypes.TABLEROW) ||
            tokenType.equals(ShopifyLiquidTypes.ENDTABLEROW) ||
            tokenType.equals(ShopifyLiquidTypes.UNLESS) ||
            tokenType.equals(ShopifyLiquidTypes.ENDUNLESS) ||
            tokenType.equals(ShopifyLiquidTypes.WHEN) ||
            tokenType.equals(ShopifyLiquidTypes.IN) ||
            tokenType.equals(ShopifyLiquidTypes.BY) ||
            tokenType.equals(ShopifyLiquidTypes.WITH) ||
            tokenType.equals(ShopifyLiquidTypes.AS) ||
            tokenType.equals(ShopifyLiquidTypes.REVERSED) ||
            tokenType.equals(ShopifyLiquidTypes.OFFSET) ||
            tokenType.equals(ShopifyLiquidTypes.LIMIT) ||
            tokenType.equals(ShopifyLiquidTypes.COLS) ||
            tokenType.equals(ShopifyLiquidTypes.FALSE) ||
            tokenType.equals(ShopifyLiquidTypes.TRUE) ||
            tokenType.equals(ShopifyLiquidTypes.NIL) ||
            tokenType.equals(ShopifyLiquidTypes.BLANK) ||
            tokenType.equals(ShopifyLiquidTypes.EMPTY)) {
            return TAG_KEYWORD_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.EQ) ||
            tokenType.equals(ShopifyLiquidTypes.NE) ||
            tokenType.equals(ShopifyLiquidTypes.GT) ||
            tokenType.equals(ShopifyLiquidTypes.LT) ||
            tokenType.equals(ShopifyLiquidTypes.GE) ||
            tokenType.equals(ShopifyLiquidTypes.LE) ||
            tokenType.equals(ShopifyLiquidTypes.OR) ||
            tokenType.equals(ShopifyLiquidTypes.AND) ||
            tokenType.equals(ShopifyLiquidTypes.CONTAINS) ||
            tokenType.equals(ShopifyLiquidTypes.DOT) ||
            tokenType.equals(ShopifyLiquidTypes.COMMA) ||
            tokenType.equals(ShopifyLiquidTypes.COLON) ||
            tokenType.equals(ShopifyLiquidTypes.LPAREN) ||
            tokenType.equals(ShopifyLiquidTypes.RPAREN) ||
            tokenType.equals(ShopifyLiquidTypes.LBRACKET) ||
            tokenType.equals(ShopifyLiquidTypes.RBRACKET) ||
            tokenType.equals(ShopifyLiquidTypes.RANGE)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.PIPE)) {
            return FILTER_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.STRING_LITERAL)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.NUMBER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(ShopifyLiquidTypes.HASH)) {
            return COMMENT_KEYS;
        }
        return EMPTY_KEYS;
    }
}
