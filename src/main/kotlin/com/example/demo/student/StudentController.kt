package com.example.demo.student

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["api/v1/students"])
class StudentController
{
    @GetMapping
    fun getStudents(): List<Student>
    {
        return listOf(Student(1L,"Nitin","nitin.k@gmail.com", Gender.MALE),
                      Student(2L,"Alex","Alex.M@gmail.com", Gender.MALE))
    }
}