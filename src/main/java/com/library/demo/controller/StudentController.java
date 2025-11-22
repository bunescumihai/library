package com.library.demo.controller;

import com.library.demo.entity.Student;
import com.library.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Map<String, String>> create(@RequestBody Student student) {

        Map<String, String> map = new HashMap<>();
        try {
            this.studentService.create(student);

            map.put("name", student.getName());
            map.put("surname", student.getSurname());
            map.put("idnp", student.getIdnp());
            map.put("phoneNumber", student.getPhoneNumber());
            map.put("instituteName", student.getInstituteName());
            map.put("birthDate", student.getBirthDate().toString());

            return ResponseEntity.status(HttpStatus.CREATED).body(map);

        }
        catch(Exception e) {
            map.put("error", e.getMessage());
            return ResponseEntity.badRequest().body(map);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, String>> getById(@PathVariable int id){
        Map<String, String> map = new HashMap<>();

        try {
            Student student = this.studentService.getById(id);

            map.put("id", student.getId().toString());
            map.put("name", student.getName());
            map.put("surname", student.getSurname());
            map.put("idnp", student.getIdnp());
            map.put("phoneNumber", student.getPhoneNumber());
            map.put("instituteName", student.getInstituteName());
            map.put("birthDate", student.getBirthDate().toString());

            return ResponseEntity.ok(map);
        }
        catch(Exception e) {
            map.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
        }
    }
}
