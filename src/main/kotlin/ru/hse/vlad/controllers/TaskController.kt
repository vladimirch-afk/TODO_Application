package ru.hse.vlad.controllers

import ru.hse.vlad.enities.TaskEntity

interface TaskController {
    fun findAll() : List<TaskEntity>
    fun createTask(desc: String, title: String) : TaskEntity
}