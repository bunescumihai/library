package com.library.demo.repository;

import com.library.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Student student) {
        String sql = "INSERT INTO student (name, surname, idnp, phoneNumber, institutename, birthdate) VALUES(?, ?, ?, ?, ?, ?)";

        this.jdbcTemplate.update(sql,
                student.getName(),
                student.getSurname(),
                student.getIdnp(),
                student.getPhoneNumber(),
                student.getInstituteName(),
                student.getBirthDate()
        );
    }

    public Student getById(int id){
        String sql = "SELECT * FROM student WHERE id = ?";

        Student student = this.jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student student1 = new Student();

            student1.setId(rs.getLong("id"));
            student1.setName(rs.getString("name"));
            student1.setSurname(rs.getString("surname"));
            student1.setIdnp(rs.getString("idnp"));
            student1.setPhoneNumber(rs.getString("phonenumber"));
            student1.setInstituteName(rs.getString("institutename"));
            student1.setBirthDate(rs.getDate("birthdate").toLocalDate());

            return student1;
        }, id);

        return student;
    }
}
