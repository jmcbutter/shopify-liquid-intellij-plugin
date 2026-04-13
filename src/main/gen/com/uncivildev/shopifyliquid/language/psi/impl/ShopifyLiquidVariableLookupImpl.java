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

public class ShopifyLiquidVariableLookupImpl extends ASTWrapperPsiElement implements ShopifyLiquidVariableLookup {

  public ShopifyLiquidVariableLookupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitVariableLookup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ShopifyLiquidAccessor> getAccessorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ShopifyLiquidAccessor.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  public String getName() {
    return ShopifyLiquidPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return ShopifyLiquidPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return ShopifyLiquidPsiImplUtil.getNameIdentifier(this);
  }

}
