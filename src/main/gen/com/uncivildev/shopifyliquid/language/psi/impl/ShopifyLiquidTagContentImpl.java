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

public class ShopifyLiquidTagContentImpl extends ASTWrapperPsiElement implements ShopifyLiquidTagContent {

  public ShopifyLiquidTagContentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ShopifyLiquidVisitor visitor) {
    visitor.visitTagContent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ShopifyLiquidVisitor) accept((ShopifyLiquidVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ShopifyLiquidAssignTag getAssignTag() {
    return findChildByClass(ShopifyLiquidAssignTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidBreakTag getBreakTag() {
    return findChildByClass(ShopifyLiquidBreakTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidCaptureTag getCaptureTag() {
    return findChildByClass(ShopifyLiquidCaptureTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidCaseTag getCaseTag() {
    return findChildByClass(ShopifyLiquidCaseTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidCommentTag getCommentTag() {
    return findChildByClass(ShopifyLiquidCommentTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidContinueTag getContinueTag() {
    return findChildByClass(ShopifyLiquidContinueTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidCycleTag getCycleTag() {
    return findChildByClass(ShopifyLiquidCycleTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidDecrementTag getDecrementTag() {
    return findChildByClass(ShopifyLiquidDecrementTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEchoTag getEchoTag() {
    return findChildByClass(ShopifyLiquidEchoTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidElseTag getElseTag() {
    return findChildByClass(ShopifyLiquidElseTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidElsifTag getElsifTag() {
    return findChildByClass(ShopifyLiquidElsifTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndcaptureTag getEndcaptureTag() {
    return findChildByClass(ShopifyLiquidEndcaptureTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndcaseTag getEndcaseTag() {
    return findChildByClass(ShopifyLiquidEndcaseTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndcommentTag getEndcommentTag() {
    return findChildByClass(ShopifyLiquidEndcommentTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndforTag getEndforTag() {
    return findChildByClass(ShopifyLiquidEndforTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndformTag getEndformTag() {
    return findChildByClass(ShopifyLiquidEndformTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndifTag getEndifTag() {
    return findChildByClass(ShopifyLiquidEndifTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndjavascriptTag getEndjavascriptTag() {
    return findChildByClass(ShopifyLiquidEndjavascriptTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndpaginateTag getEndpaginateTag() {
    return findChildByClass(ShopifyLiquidEndpaginateTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndrawTag getEndrawTag() {
    return findChildByClass(ShopifyLiquidEndrawTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndschemaTag getEndschemaTag() {
    return findChildByClass(ShopifyLiquidEndschemaTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndstyleTag getEndstyleTag() {
    return findChildByClass(ShopifyLiquidEndstyleTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndtablerowTag getEndtablerowTag() {
    return findChildByClass(ShopifyLiquidEndtablerowTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidEndunlessTag getEndunlessTag() {
    return findChildByClass(ShopifyLiquidEndunlessTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidForTag getForTag() {
    return findChildByClass(ShopifyLiquidForTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidFormTag getFormTag() {
    return findChildByClass(ShopifyLiquidFormTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidGenericTag getGenericTag() {
    return findChildByClass(ShopifyLiquidGenericTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidIfTag getIfTag() {
    return findChildByClass(ShopifyLiquidIfTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidIfchangedTag getIfchangedTag() {
    return findChildByClass(ShopifyLiquidIfchangedTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidIncrementTag getIncrementTag() {
    return findChildByClass(ShopifyLiquidIncrementTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidJavascriptTag getJavascriptTag() {
    return findChildByClass(ShopifyLiquidJavascriptTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidLayoutTag getLayoutTag() {
    return findChildByClass(ShopifyLiquidLayoutTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidLiquidTagKw getLiquidTagKw() {
    return findChildByClass(ShopifyLiquidLiquidTagKw.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidPaginateTag getPaginateTag() {
    return findChildByClass(ShopifyLiquidPaginateTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidRawTag getRawTag() {
    return findChildByClass(ShopifyLiquidRawTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidRenderTag getRenderTag() {
    return findChildByClass(ShopifyLiquidRenderTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidSchemaTag getSchemaTag() {
    return findChildByClass(ShopifyLiquidSchemaTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidSectionTag getSectionTag() {
    return findChildByClass(ShopifyLiquidSectionTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidSectionsTag getSectionsTag() {
    return findChildByClass(ShopifyLiquidSectionsTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidStyleTag getStyleTag() {
    return findChildByClass(ShopifyLiquidStyleTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidStylesheetTag getStylesheetTag() {
    return findChildByClass(ShopifyLiquidStylesheetTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidTablerowTag getTablerowTag() {
    return findChildByClass(ShopifyLiquidTablerowTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidUnlessTag getUnlessTag() {
    return findChildByClass(ShopifyLiquidUnlessTag.class);
  }

  @Override
  @Nullable
  public ShopifyLiquidWhenTag getWhenTag() {
    return findChildByClass(ShopifyLiquidWhenTag.class);
  }

}
