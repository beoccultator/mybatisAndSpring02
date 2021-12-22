package com.test.controller;

import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {

    @Autowired
    private StudentService studentService;

}
