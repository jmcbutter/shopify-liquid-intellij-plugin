package com.uncivildev.shopifyliquid.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.uncivildev.shopifyliquid.language.ShopifyLiquidIcons;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidElementFactory;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidFilter;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidProperty;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidTypes;
import com.uncivildev.shopifyliquid.language.psi.ShopifyLiquidVariableLookup;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ShopifyLiquidPsiImplUtil {
    public static String getKey(ShopifyLiquidProperty element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static String getValue(ShopifyLiquidProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(ShopifyLiquidTypes.EXPRESSION);
        if (valueNode == null) {
            valueNode = element.getNode().findChildByType(ShopifyLiquidTypes.LITERAL);
        }
        if (valueNode == null) {
            valueNode = element.getNode().findChildByType(ShopifyLiquidTypes.VARIABLE_LOOKUP);
        }
        if (valueNode != null) {
            return valueNode.getText();
        }
        return null;
    }

    public static String getName(ShopifyLiquidProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(ShopifyLiquidProperty element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            ShopifyLiquidProperty property = ShopifyLiquidElementFactory.createProperty(element.getProject(), newName);
            ASTNode newIdentifierNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(ShopifyLiquidProperty element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }

    public static ItemPresentation getPresentation(final ShopifyLiquidProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return element.getContainingFile().getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return ShopifyLiquidIcons.FILE;
            }
        };
    }
    public static String getName(ShopifyLiquidVariableLookup element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static PsiElement setName(ShopifyLiquidVariableLookup element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            ShopifyLiquidVariableLookup variableLookup = ShopifyLiquidElementFactory.createVariableLookup(element.getProject(), newName);
            ASTNode newIdentifierNode = variableLookup.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(ShopifyLiquidVariableLookup element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }

    public static String getName(ShopifyLiquidFilter element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static PsiElement setName(ShopifyLiquidFilter element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            ShopifyLiquidFilter filter = ShopifyLiquidElementFactory.createFilter(element.getProject(), newName);
            ASTNode newIdentifierNode = filter.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(ShopifyLiquidFilter element) {
        ASTNode identifierNode = element.getNode().findChildByType(ShopifyLiquidTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }
}
