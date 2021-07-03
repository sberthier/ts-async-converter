package com.github.sberthier.tsasyncconverter.services

import com.github.sberthier.tsasyncconverter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
