package com.example.demo.controller;

import com.example.demo.ApiResponse;
import com.example.demo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/student")
    public ApiResponse getStudent() {

        Student student = new Student(1, "Mukesh", 25);

        ApiResponse response = new ApiResponse(
                true,
                "Student fetched successfully",
                student
        );

        return response;
    }
}