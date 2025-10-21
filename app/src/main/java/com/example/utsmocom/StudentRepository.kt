package com.example.utsmocom

import androidx.compose.runtime.mutableStateListOf

object StudentRepository {
    val studentList = mutableStateListOf<Student>()

    fun Student(student: Student) {
        studentList.add(student)
    }
}