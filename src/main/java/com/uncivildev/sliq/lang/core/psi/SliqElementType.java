package com.uncivildev.sliq.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.SliqLanguage;

public class SliqElementType extends IElementType {
    public SliqElementType(String debugName) {
        super(debugName, SliqLanguage.INSTANCE);
    }
}
