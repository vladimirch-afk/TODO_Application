package ru.hse.vlad.services

import org.springframework.stereotype.Service
import ru.hse.vlad.enities.TaskEntity

@Service
class RuntimeTaskService : TaskService {
    val db = mutableListOf<TaskEntity>()
    override fun getAll(): List<TaskEntity> {
        return db
    }

    override fun addTask(desc: String, title: String) : TaskEntity {
        val id = db.size
        val newTask = TaskEntity(id, title, desc)
        db.add(newTask)
        return newTask
    }

}