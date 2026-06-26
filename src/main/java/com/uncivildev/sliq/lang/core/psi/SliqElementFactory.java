package com.uncivildev.sliq.lang.core.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.uncivildev.sliq.lang.SliqFileType;

public class SliqElementFactory {
    public static SliqFile createFile(Project project, String text) {
        String name = "dummy.sliq";
        return (SliqFile) PsiFileFactory.getInstance(project).createFileFromText(name, SliqFileType.INSTANCE, text);
    }
}
