package com.uncivildev.sliq.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.uncivildev.sliq.lang.SliqLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SliqTokenType extends IElementType {
    public SliqTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SliqLanguage.INSTANCE);
    }

    public String toString() {
        return "SliqTokenType." + super.toString();
    }
}
