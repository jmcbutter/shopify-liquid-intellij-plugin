package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.psi.tree.IElementType;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidLanguage;

public class ShopifyLiquidElementType extends IElementType {
    public ShopifyLiquidElementType(String debugName) {
        super(debugName, ShopifyLiquidLanguage.INSTANCE);
    }
}
