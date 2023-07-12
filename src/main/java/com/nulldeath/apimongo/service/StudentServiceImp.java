package com.nulldeath.apimongo.service;

import com.nulldeath.apimongo.model.StudentRequest;
import com.nulldeath.apimongo.model.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Override
    public StudentResponse create(StudentRequest request) {
        return null;
    }

    @Override
    public List<StudentResponse> getAll() {
        return null;
    }
}
