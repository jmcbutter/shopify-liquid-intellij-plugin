// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ShopifyLiquidForTag extends PsiElement {

  @NotNull
  List<ShopifyLiquidProperty> getPropertyList();

  @Nullable
  ShopifyLiquidRangeExpression getRangeExpression();

  @Nullable
  ShopifyLiquidVariableLookup getVariableLookup();

  @NotNull
  PsiElement getIdentifier();

}
