package com.uncivildev.shopifyliquid.language;

import com.intellij.lexer.FlexAdapter;

public class ShopifyLiquidLexerAdapter extends FlexAdapter {
    public ShopifyLiquidLexerAdapter() {
        super(new ShopifyLiquidLexer(null));
    }
}
