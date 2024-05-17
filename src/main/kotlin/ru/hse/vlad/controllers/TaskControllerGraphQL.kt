package ru.hse.vlad.controllers

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import ru.hse.vlad.enities.TaskEntity
import ru.hse.vlad.services.RuntimeTaskService
import ru.hse.vlad.services.TaskService

@Controller
class TaskControllerGraphQL(val taskService: RuntimeTaskService) : TaskController {

    @QueryMapping
    override fun findAll(): List<TaskEntity> {
        return taskService.getAll()
    }

    @MutationMapping
    override fun createTask(@Argument desc: String, @Argument title: String): TaskEntity {
        return taskService.addTask(desc, title)
    }
}