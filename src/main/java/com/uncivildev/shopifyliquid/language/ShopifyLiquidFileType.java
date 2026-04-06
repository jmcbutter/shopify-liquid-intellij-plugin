package com.uncivildev.shopifyliquid.language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class ShopifyLiquidFileType extends LanguageFileType {
    public static final ShopifyLiquidFileType INSTANCE = new ShopifyLiquidFileType();
    private ShopifyLiquidFileType() {
        super(ShopifyLiquidLanguage.INTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Shopify Liquid";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Shopify Liquid file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "liquid";
    }

    @Override
    public Icon getIcon() {
        return ShopifyLiquidIcons.FILE;
    }
}
