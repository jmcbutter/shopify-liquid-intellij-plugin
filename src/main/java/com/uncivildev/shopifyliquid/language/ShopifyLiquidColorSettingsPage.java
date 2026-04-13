package com.uncivildev.shopifyliquid.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class ShopifyLiquidColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
        new AttributesDescriptor("Delimiters", ShopifyLiquidSyntaxHighlighter.TAG_DELIMITER),
        new AttributesDescriptor("Keywords", ShopifyLiquidSyntaxHighlighter.TAG_KEYWORD),
        new AttributesDescriptor("Strings", ShopifyLiquidSyntaxHighlighter.STRING),
        new AttributesDescriptor("Numbers", ShopifyLiquidSyntaxHighlighter.NUMBER),
        new AttributesDescriptor("Operators", ShopifyLiquidSyntaxHighlighter.OPERATOR),
        new AttributesDescriptor("Identifiers", ShopifyLiquidSyntaxHighlighter.IDENTIFIER),
        new AttributesDescriptor("Filters", ShopifyLiquidSyntaxHighlighter.FILTER),
        new AttributesDescriptor("Comments", ShopifyLiquidSyntaxHighlighter.COMMENT),
    };

    private static final Map<String, TextAttributesKey> TAGS = Map.of(
        "del", ShopifyLiquidSyntaxHighlighter.TAG_DELIMITER,
        "kw", ShopifyLiquidSyntaxHighlighter.TAG_KEYWORD,
        "str", ShopifyLiquidSyntaxHighlighter.STRING,
        "num", ShopifyLiquidSyntaxHighlighter.NUMBER,
        "op", ShopifyLiquidSyntaxHighlighter.OPERATOR,
        "id", ShopifyLiquidSyntaxHighlighter.IDENTIFIER,
        "filt", ShopifyLiquidSyntaxHighlighter.FILTER,
        "com", ShopifyLiquidSyntaxHighlighter.COMMENT
    );

    @Override
    public Icon getIcon() {
        return ShopifyLiquidIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new ShopifyLiquidSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "<del>{%</del> <kw>assign</kw> <id>my_variable</id> <op>=</op> <str>\"Hello World\"</str> <del>%}</del>\n" +
               "<del>{{</del> <id>product</id>.<id>title</id> <op>|</op> <filt>upcase</filt> <del>}}</del>\n" +
               "<del>{%-</del> <kw>if</kw> <id>num</id> <op>></op> <num>10</num> <del>-%}</del>\n" +
               "  <com># This is a comment</com>\n" +
               "  <del>{%</del> <kw>echo</kw> <str>'High'</str> <del>%}</del>\n" +
               "<del>{%-</del> <kw>endif</kw> <del>-%}</del>";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return TAGS;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Shopify Liquid";
    }
}
