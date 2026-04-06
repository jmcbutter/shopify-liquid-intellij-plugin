package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.psi.tree.IElementType;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ShopifyLiquidTokenType extends IElementType {
    public ShopifyLiquidTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ShopifyLiquidLanguage.INSTANCE);
    }

    public String toString() {
        return "ShopifyLiquidTokenType." + super.toString();
    }
}
