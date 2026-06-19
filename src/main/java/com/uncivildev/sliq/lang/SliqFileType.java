package com.uncivildev.sliq.lang;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class SliqFileType extends LanguageFileType {
    public static final SliqFileType INSTANCE = new SliqFileType();
    private SliqFileType() {
        super(SliqLanguage.INSTANCE);
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
        return SliqIcons.FILE;
    }
}
