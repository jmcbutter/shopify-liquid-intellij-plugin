package com.uncivildev.sliq.lang.core.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.uncivildev.sliq.lang.core.psi.SliqTypes;
import org.jetbrains.annotations.NotNull;

public class SliqCompletionContributor extends CompletionContributor {
    SliqCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement().afterLeaf(PlatformPatterns.psiElement(SliqTypes.LIQUID_TAG_BEGIN)),
                new CompletionProvider<>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("raw"));
                        resultSet.addElement(LookupElementBuilder.create("endraw"));
                    }
                });
    }
}
