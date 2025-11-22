package com.library.demo.service;

import com.library.demo.entity.Student;

public interface StudentService {
    void create(Student student) throws Exception;
    Student getById(int id) throws Exception;
}
