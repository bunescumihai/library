package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
public class Student extends Person {
    private String instituteName;
    private LocalDate birthDate;
    public Student() {
        super();
    }
}
