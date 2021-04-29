package com.github.anhquande.refactoringimportintellijplugin.services

import com.github.anhquande.refactoringimportintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
