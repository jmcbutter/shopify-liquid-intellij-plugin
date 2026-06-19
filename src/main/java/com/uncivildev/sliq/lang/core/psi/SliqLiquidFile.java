package com.uncivildev.sliq.lang.core.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.uncivildev.sliq.lang.SliqFileType;
import com.uncivildev.sliq.lang.SliqLanguage;
import org.jetbrains.annotations.NotNull;

public class SliqLiquidFile extends PsiFileBase {
    public SliqLiquidFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SliqLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SliqFileType.INSTANCE;
    }

    public String toString() {
        return "Shopify Liquid file";
    }
}
