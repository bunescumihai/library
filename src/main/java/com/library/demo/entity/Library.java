package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Library {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

    private String librarianId;
    private Librarian librarian;

    public Library() {
    }
}
