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

public class ShopifyLiquidValueImpl extends ASTWrapperPsiElement implements ShopifyLiquidValue {

  public ShopifyLiquidValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ShopifyLiquidLiteral getLiteral() {
    return findChildByClass(ShopifyLiquidLiteral.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidRangeExpression getRangeExpression() {
    return findChildByClass(ShopifyLiquidRangeExpression.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidVariableLookup getVariableLookup() {
    return findChildByClass(ShopifyLiquidVariableLookup.class);
  }

}
