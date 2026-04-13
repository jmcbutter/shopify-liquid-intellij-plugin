// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ShopifyLiquidGenericTag extends PsiElement {

  @NotNull
  List<ShopifyLiquidExpression> getExpressionList();

  @NotNull
  List<ShopifyLiquidParameter> getParameterList();

  @NotNull
  PsiElement getIdentifier();

}
