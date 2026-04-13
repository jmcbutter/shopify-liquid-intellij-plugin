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

public class ShopifyLiquidRenderTagImpl extends ASTWrapperPsiElement implements ShopifyLiquidRenderTag {

  public ShopifyLiquidRenderTagImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitRenderTag(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ShopifyLiquidProperty> getPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ShopifyLiquidProperty.class);
  }

  @Override
  @NotNull
  public List<ShopifyLiquidVariableLookup> getVariableLookupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ShopifyLiquidVariableLookup.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getStringLiteral() {
    return findChildByType(STRING_LITERAL);
  }

}
