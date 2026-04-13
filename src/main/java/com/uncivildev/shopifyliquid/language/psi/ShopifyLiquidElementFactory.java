package com.uncivildev.shopifyliquid.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidFileType;

public class ShopifyLiquidElementFactory {
    public static ShopifyLiquidProperty createProperty(Project project, String name) {
        final ShopifyLiquidFile file = createFile(project, "{% " + name + " %}");
        return PsiTreeUtil.findChildOfType(file, ShopifyLiquidProperty.class);
    }

    public static ShopifyLiquidFilter createFilter(Project project, String name) {
        final ShopifyLiquidFile file = createFile(project, "{{ x | " + name + " }}");
        return PsiTreeUtil.findChildOfType(file, ShopifyLiquidFilter.class);
    }

    public static ShopifyLiquidVariableLookup createVariableLookup(Project project, String name) {
        final ShopifyLiquidFile file = createFile(project, "{{ " + name + " }}");
        return PsiTreeUtil.findChildOfType(file, ShopifyLiquidVariableLookup.class);
    }

    public static ShopifyLiquidFile createFile(Project project, String text) {
        String name = "dummy.liquid";
        return (ShopifyLiquidFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, ShopifyLiquidFileType.INSTANCE, text);
    }
}
