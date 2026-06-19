package com.uncivildev.sliq.lang.core.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.uncivildev.sliq.lang.SliqIcons;
import com.uncivildev.sliq.lang.core.psi.SliqElementFactory;
import com.uncivildev.sliq.lang.core.psi.SliqFilter;
import com.uncivildev.sliq.lang.core.psi.SliqProperty;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import com.uncivildev.sliq.lang.core.psi.SliqVariableLookup;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SliqPsiImplUtil {
    public static String getKey(SliqProperty element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static String getValue(SliqProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(SliqTypes.EXPRESSION);
        if (valueNode == null) {
            valueNode = element.getNode().findChildByType(SliqTypes.LITERAL);
        }
        if (valueNode == null) {
            valueNode = element.getNode().findChildByType(SliqTypes.VARIABLE_LOOKUP);
        }
        if (valueNode != null) {
            return valueNode.getText();
        }
        return null;
    }

    public static String getName(SliqProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(SliqProperty element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            SliqProperty property = SliqElementFactory.createProperty(element.getProject(), newName);
            ASTNode newIdentifierNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(SliqProperty element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }

    public static ItemPresentation getPresentation(final SliqProperty element) {
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
                return SliqIcons.FILE;
            }
        };
    }
    public static String getName(SliqVariableLookup element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static PsiElement setName(SliqVariableLookup element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            SliqVariableLookup variableLookup = SliqElementFactory.createVariableLookup(element.getProject(), newName);
            ASTNode newIdentifierNode = variableLookup.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(SliqVariableLookup element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }

    public static String getName(SliqFilter element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getText();
        }
        return null;
    }

    public static PsiElement setName(SliqFilter element, String newName) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            SliqFilter filter = SliqElementFactory.createFilter(element.getProject(), newName);
            ASTNode newIdentifierNode = filter.getFirstChild().getNode();
            element.getNode().replaceChild(identifierNode, newIdentifierNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(SliqFilter element) {
        ASTNode identifierNode = element.getNode().findChildByType(SliqTypes.IDENTIFIER);
        if (identifierNode != null) {
            return identifierNode.getPsi();
        }
        return null;
    }
}
