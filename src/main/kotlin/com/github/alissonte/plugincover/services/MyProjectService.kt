package com.github.alissonte.plugincover.services

import com.github.alissonte.plugincover.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
