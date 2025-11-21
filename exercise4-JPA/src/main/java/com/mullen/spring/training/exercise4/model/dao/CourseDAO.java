package com.mullen.spring.training.exercise4.model.dao;

import com.mullen.spring.training.exercise4.model.dto.Course;
import jakarta.persistence.*;

import java.util.Objects;

@Entity(name="course")
public class CourseDAO {
    @Column (name = "name", nullable = false)
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long identifier;

    @Column (name = "author", nullable = false)
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

public CourseDAO(String name, Long identifier, String author){
    this.name = name;
    this.identifier = identifier;
    this.author = author;
}


    public CourseDAO (String name, String author){
        this.name = name;
        this.author = author;
        this.identifier = null;
    }

    public CourseDAO(){

    }

    public Course getCourse(){
        return new Course(this.name, this.identifier, this.author);
    }

}
