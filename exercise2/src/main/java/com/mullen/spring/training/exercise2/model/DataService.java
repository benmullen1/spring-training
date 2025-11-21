package com.mullen.spring.training.exercise2.model;

import com.mullen.spring.training.exercise2.model.dto.Course;

import java.util.ArrayList;

public interface DataService {

    public Course[] retrieveData();
    public Course findCourse(String identifier);
    public void addCourse(Course course);

}
