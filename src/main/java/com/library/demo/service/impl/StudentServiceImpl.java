package com.library.demo.service.impl;

import com.library.demo.entity.Student;
import com.library.demo.repository.StudentRepository;
import com.library.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(Student student) throws Exception {

        if(student.getName() == null || student.getName().length() < 3){
            throw new Exception("Student name must be at least 3 characters long");
        }

        this.studentRepository.create(student);
    }

    @Override
    public Student getById(int id) throws Exception {
        Student student = this.studentRepository.getById(id);

        if(student == null) {
            throw new Exception("Student not found with id: " + id);
        }

        return student;
    }
}
