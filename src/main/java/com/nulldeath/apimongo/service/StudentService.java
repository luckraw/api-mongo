package com.nulldeath.apimongo.service;

import com.nulldeath.apimongo.model.StudentRequest;
import com.nulldeath.apimongo.model.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest request);

    List<StudentResponse> getAll();
}
