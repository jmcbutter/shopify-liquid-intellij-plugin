package com.uncivildev.sliq.lang;
import com.intellij.lang.Language;

public class SliqLanguage extends Language {
    public static final SliqLanguage INSTANCE = new SliqLanguage();

    private SliqLanguage() {
        super("Sliq");
    }
}
