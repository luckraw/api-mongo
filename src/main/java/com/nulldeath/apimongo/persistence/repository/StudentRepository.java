package com.nulldeath.apimongo.persistence.repository;

import com.nulldeath.apimongo.persistence.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
