package com.uncivildev.shopifyliquid.language;
import com.intellij.lang.Language;

public class ShopifyLiquidLanguage extends Language {
    public static final ShopifyLiquidLanguage INSTANCE = new ShopifyLiquidLanguage();

    private ShopifyLiquidLanguage() {
        super("ShopifyLiquid");
    }
}
