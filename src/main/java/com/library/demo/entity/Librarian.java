package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Librarian extends Person {
    private String email;

    public Librarian() {
        super();
    }
}
