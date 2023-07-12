package com.nulldeath.apimongo.controller;

import com.nulldeath.apimongo.model.StudentRequest;
import com.nulldeath.apimongo.model.StudentResponse;
import com.nulldeath.apimongo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest request) {

        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAll() {

        return ResponseEntity.ok(service.getAll());
    }
}
