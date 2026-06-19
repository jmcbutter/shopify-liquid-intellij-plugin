package com.uncivildev.sliq.lang;

import com.intellij.lexer.FlexAdapter;
import com.uncivildev.sliq.lang.SliqLexer;

public class SliqLexerAdapter extends FlexAdapter {
    public SliqLexerAdapter() {
        super(new SliqLexer(null));
    }
}
