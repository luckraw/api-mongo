package com.nulldeath.apimongo.service;

import com.nulldeath.apimongo.model.StudentRequest;
import com.nulldeath.apimongo.model.StudentResponse;
import com.nulldeath.apimongo.persistence.entity.Student;
import com.nulldeath.apimongo.persistence.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setBirthDate(request.getBirthDate());
        student.setDocument(request.getDocument());
        student.setSecondKey(UUID.randomUUID().toString());

        studentRepository.save(student);

        return createResponse(student);

    }

    private StudentResponse createResponse(Student student) {

        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setDocument(student.getDocument());
        response.setBirthDate(student.getBirthDate());


        return response;
    }

    @Override
    public List<StudentResponse> getAll() {
        List<StudentResponse> responses = new ArrayList<>();

        List<Student> students = studentRepository.findAll();

        if(!students.isEmpty()) {
            students.forEach(student -> responses.add(createResponse(student)));
            
        }

        for (Student student : students) {
            responses.add(createResponse(student));
        }

        return responses;
    }
}
