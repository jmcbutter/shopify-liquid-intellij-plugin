package com.uncivildev.sliq.lang.core.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class SliqNamedElementImpl extends ASTWrapperPsiElement {
    public SliqNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
