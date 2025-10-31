package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Person {
    private Long id;
    private String name;
    private String surname;
    private String idnp;
    private String phoneNumber;
    public Person() {    }
}
