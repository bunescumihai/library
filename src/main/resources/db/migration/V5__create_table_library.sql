CREATE TABLE library(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(15),
    email VARCHAR(255),
    librarianId INT NOT NULL ,
    CONSTRAINT fk_librarian FOREIGN KEY(librarianId) REFERENCES librarian(id)
)