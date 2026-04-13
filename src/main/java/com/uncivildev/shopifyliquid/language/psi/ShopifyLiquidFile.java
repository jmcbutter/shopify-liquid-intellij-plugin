package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidFileType;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidLanguage;
import org.jetbrains.annotations.NotNull;

public class ShopifyLiquidFile extends PsiFileBase {
    public ShopifyLiquidFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ShopifyLiquidLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ShopifyLiquidFileType.INSTANCE;
    }

    public String toString() {
        return "Shopify Liquid file";
    }
}
