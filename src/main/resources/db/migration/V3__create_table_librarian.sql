CREATE TABLE librarian(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL ,
    idnp VARCHAR(13) NOT NULL ,
    phoneNumber VARCHAR(15) ,
    email VARCHAR(255)
);