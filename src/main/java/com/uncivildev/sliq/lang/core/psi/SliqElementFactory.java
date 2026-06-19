package com.uncivildev.sliq.lang.core.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import com.uncivildev.sliq.lang.core.psi.SliqFilter;
import com.uncivildev.sliq.lang.core.psi.SliqProperty;
import com.uncivildev.sliq.lang.core.psi.SliqVariableLookup;
import com.uncivildev.sliq.lang.SliqFileType;

public class SliqElementFactory {
    public static SliqProperty createProperty(Project project, String name) {
        final SliqLiquidFile file = createFile(project, "{% " + name + " %}");
        return PsiTreeUtil.findChildOfType(file, SliqProperty.class);
    }

    public static SliqFilter createFilter(Project project, String name) {
        final SliqLiquidFile file = createFile(project, "{{ x | " + name + " }}");
        return PsiTreeUtil.findChildOfType(file, SliqFilter.class);
    }

    public static SliqVariableLookup createVariableLookup(Project project, String name) {
        final SliqLiquidFile file = createFile(project, "{{ " + name + " }}");
        return PsiTreeUtil.findChildOfType(file, SliqVariableLookup.class);
    }

    public static SliqLiquidFile createFile(Project project, String text) {
        String name = "dummy.liquid";
        return (SliqLiquidFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, SliqFileType.INSTANCE, text);
    }
}
