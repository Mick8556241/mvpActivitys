package com.github.mick8556241.mvpactivitys.services

import com.github.mick8556241.mvpactivitys.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
