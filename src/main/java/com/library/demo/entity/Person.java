package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private Long id;
    private String name;
    private String surname;
    private String idnp;
    private String phoneNumber;
}
