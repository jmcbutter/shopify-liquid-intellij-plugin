package com.uncivildev.sliq.ide.color;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.uncivildev.sliq.ide.highlight.SliqSyntaxHighlighter;
import com.uncivildev.sliq.ide.icons.SliqIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import java.util.Map;

final class SliqColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", SliqSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Liquid Delimiter", SliqSyntaxHighlighter.LIQUID_DELIMITER)
    };

    @Override
    public Icon getIcon() {
        return SliqIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new SliqSyntaxHighlighter();
    }

    public String getDemoText() {
        return """
                {% raw %}
                This is some raw text
                {% endraw %}
                """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Nullable
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
