// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.uncivildev.shopifyliquid.language.psi.*;

public class ShopifyLiquidEndschemaTagImpl extends ASTWrapperPsiElement implements ShopifyLiquidEndschemaTag {

  public ShopifyLiquidEndschemaTagImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitEndschemaTag(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

}
