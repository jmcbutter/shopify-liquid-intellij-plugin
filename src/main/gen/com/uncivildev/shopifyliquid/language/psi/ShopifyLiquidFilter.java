// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface ShopifyLiquidFilter extends PsiNameIdentifierOwner {

  @Nullable
  ShopifyLiquidFilterArguments getFilterArguments();

  @NotNull
  PsiElement getIdentifier();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
