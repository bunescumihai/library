CREATE TABLE book_borrowing(
    id SERIAL PRIMARY KEY,
    book_id INT NOT NULL,
    student_id INT NOT NULL,
    librarian_id INT NOT NULL,
    CONSTRAINT fk_book FOREIGN KEY(book_id) REFERENCES book(id),
    CONSTRAINT fk_student FOREIGN KEY(student_id) REFERENCES student(id),
    CONSTRAINT fk_librarian FOREIGN KEY(librarian_id) REFERENCES librarian(id)
);