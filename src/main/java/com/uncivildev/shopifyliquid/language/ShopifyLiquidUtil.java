package com.uncivildev.shopifyliquid.language;

import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidFile;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidProperty;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import org.jetbrains.annotations.NotNull;
import org.jsoup.internal.StringUtil;

import java.util.*;

public class ShopifyLiquidUtil {
    /**
     * Searches the entire project for Shopify Liquid language files with instances of the Shopify Liquid property with the given key.
     *
     * @param project current project
     * @param key     the key to search for
     * @return matching properties
     */
    public static List<ShopifyLiquidProperty> findProperties(Project project, String key) {
        List<ShopifyLiquidProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(ShopifyLiquidFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            ShopifyLiquidFile shopifyLiquidFile = (ShopifyLiquidFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (shopifyLiquidFile != null) {
                ShopifyLiquidProperty[] properties = PsiTreeUtil.getChildrenOfType(shopifyLiquidFile, ShopifyLiquidProperty.class);
                if (properties != null) {
                    for (ShopifyLiquidProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<ShopifyLiquidProperty> findProperties(Project project) {
        List<ShopifyLiquidProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(ShopifyLiquidFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            ShopifyLiquidFile shopifyLiquidFile = (ShopifyLiquidFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (shopifyLiquidFile != null) {
                ShopifyLiquidProperty[] properties = PsiTreeUtil.getChildrenOfType(shopifyLiquidFile, ShopifyLiquidProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }
        return result;
    }

    public static @NotNull String findDocumentationComment(ShopifyLiquidProperty property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String commentText = element.getText().replaceFirst("[!# ]+", "");
                result.add(commentText);
            }
            element = element.getPrevSibling();
        }
        return StringUtil.join(Lists.reverse(result), "\n ");
    }
}
