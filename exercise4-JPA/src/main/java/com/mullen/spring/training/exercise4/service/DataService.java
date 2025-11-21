package com.mullen.spring.training.exercise4.service;

import com.mullen.spring.training.exercise4.model.dto.Course;

import java.util.List;

public interface DataService {

    public List<Course> retrieveData();
    public Course findCourse(long identifier);
    public void addCourse(String name, String author);

}
