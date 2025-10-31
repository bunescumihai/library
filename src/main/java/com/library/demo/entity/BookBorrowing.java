package com.library.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookBorrowing {
    private Long id;

    private Integer bookId;
    private Integer studentId;
    private Integer libraryId;

    private Library library;
    private Student student;
    private Book book;

    public BookBorrowing(){}

}

