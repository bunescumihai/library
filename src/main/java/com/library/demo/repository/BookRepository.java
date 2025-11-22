package com.library.demo.repository;

import com.library.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Book book){
        String sql = "INSERT INTO book (title, authorfullname, pagenumber, publisher) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthorFullName(), book.getPageNumber(), book.getPublisher());
    }

    public List<Book> getAll(){
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Book(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("authorfullname"),
                rs.getInt("pagenumber"),
                rs.getString("publisher")
        ));
    }

}
