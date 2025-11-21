package com.mullen.spring.training.exercise3.service;

import com.mullen.spring.training.exercise3.model.dto.Course;

import java.util.List;

public interface DataService {

    public List<Course> retrieveData();
    public Course findCourse(long identifier);
    public void addCourse(String name, String author);

}
