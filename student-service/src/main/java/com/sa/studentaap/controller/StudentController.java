package com.sa.studentaap.controller;

import com.sa.studentaap.entity.Student;
import com.sa.studentaap.response.StudentResponse;
import com.sa.studentaap.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(
            @RequestBody Student student)
    {
        return studentService.saveDepartment(student);
    }

    @GetMapping("/students/{id}")
    private ResponseEntity<StudentResponse> getStudentDetails(@PathVariable("id") int id) {
        StudentResponse student = studentService.getStudentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }
}
