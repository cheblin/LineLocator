package com.github.cheblin.linelocator.services

import com.intellij.openapi.project.Project
import com.github.cheblin.linelocator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
