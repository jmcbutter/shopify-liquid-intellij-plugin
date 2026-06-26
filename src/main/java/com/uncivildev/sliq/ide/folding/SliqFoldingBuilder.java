package com.uncivildev.sliq.ide.folding;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.uncivildev.sliq.lang.core.psi.SliqRawTag;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import com.uncivildev.sliq.lang.core.psi.SliqVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class SliqFoldingBuilder extends FoldingBuilderEx implements DumbAware {

    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root,
                                                          @NotNull Document document,
                                                          boolean quick) {
        FoldingGroup group = FoldingGroup.newGroup("raw");
        List<FoldingDescriptor> descriptors = new ArrayList<>();

        for (SliqRawTag tag : PsiTreeUtil.findChildrenOfType(root, SliqRawTag.class)) {
            int start = tag.getTextRange().getStartOffset();
            int end = tag.getTextRange().getEndOffset();
            descriptors.add(new FoldingDescriptor(tag.getNode(),
                    new TextRange(start, end),
                    group));
        }

        return descriptors.toArray(FoldingDescriptor.EMPTY_ARRAY);
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        return "IF STMT";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }
}
