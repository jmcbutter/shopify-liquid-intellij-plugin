package com.uncivildev.sliq.lang.core.psi;

import com.intellij.psi.tree.TokenSet;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;

public interface SliqTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(SliqTypes.IDENTIFIER);
    TokenSet STRING_LITERALS = TokenSet.create(SliqTypes.STRING_LITERAL);
    TokenSet NUMBER_LITERALS = TokenSet.create(SliqTypes.NUMBER);

    // TokenSet COMMENTS = TokenSet.create(SliqTypes.COMMENT);
}
