// This is a generated file. Not intended for manual editing.
package com.uncivildev.shopifyliquid.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.navigation.ItemPresentation;

public interface ShopifyLiquidProperty extends PsiNameIdentifierOwner {

  @Nullable
  ShopifyLiquidExpression getExpression();

  @NotNull
  PsiElement getIdentifier();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
