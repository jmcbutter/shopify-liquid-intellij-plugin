package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.psi.tree.TokenSet;

public interface ShopifyLiquidTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(ShopifyLiquidTypes.IDENTIFIER);
    TokenSet STRING_LITERALS = TokenSet.create(ShopifyLiquidTypes.STRING_LITERAL);
    TokenSet NUMBER_LITERALS = TokenSet.create(ShopifyLiquidTypes.NUMBER);

    // TokenSet COMMENTS = TokenSet.create(ShopifyLiquidTypes.COMMENT);
}
