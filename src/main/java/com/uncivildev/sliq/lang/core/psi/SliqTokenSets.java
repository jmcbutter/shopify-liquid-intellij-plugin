package com.uncivildev.sliq.lang.core.psi;

import com.intellij.psi.tree.TokenSet;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;

public interface SliqTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(SliqTypes.TAG_NAME_RAW, SliqTypes.TAG_NAME_ENDRAW);
    TokenSet DELIMITERS = TokenSet.create(SliqTypes.LIQUID_TAG_BEGIN, SliqTypes.LIQUID_TAG_END);
    // TokenSet COMMENTS = TokenSet.create(SliqTypes.COMMENT);
}
