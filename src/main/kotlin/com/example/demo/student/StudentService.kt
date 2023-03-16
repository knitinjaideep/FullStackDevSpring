package com.example.demo.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    private lateinit var studentRepository: StudentRepository

    fun getAllStudents(): List<Student>{
        return studentRepository.findAll()
    }
}