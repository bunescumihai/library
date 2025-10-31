CREATE TABLE book(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    authorFullName VARCHAR(255) NOT NULL,
    pageNumber INT NOT NULL ,
    publisher VARCHAR(255) NOT NULL
);