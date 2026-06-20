package com.uncivildev.sliq.lang.core.lexer;

import com.intellij.lexer.FlexAdapter;
import com.uncivildev.sliq.lang.core.lexer.SliqLexer;

public class SliqLexerAdapter extends FlexAdapter {
    public SliqLexerAdapter() {
        super(new SliqLexer(null));
    }
}
