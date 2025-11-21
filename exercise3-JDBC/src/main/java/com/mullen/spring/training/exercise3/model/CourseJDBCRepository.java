package com.mullen.spring.training.exercise3.model;

import com.mullen.spring.training.exercise3.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private NamedParameterJdbcTemplate nameTemplate;

    private final String insertQuery = """
            INSERT INTO course (name, author) VALUES('AWS Training', 'Jan Jansen')
            """;

    public void insertFixed (){
        template.update(insertQuery);
    }

    public void insert(String name, String author){
        String insertQueryNamed = "INSERT INTO course (name, author) VALUES (:name, :author)";
        MapSqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("name", name)
                .addValue("author",author);
        nameTemplate.update(insertQueryNamed, parameterSource);
    }



    public List<Course> retrieve(){
        String retrievalQuery = "SELECT name, id, author FROM course";
        RowMapper<Course> courseMapper = (rs, rowNum) ->
                new Course(
                        rs.getString("name"),
                        rs.getLong("id"),
                        rs.getString("author")
                );

        return template.query(retrievalQuery, courseMapper);
    }


}
