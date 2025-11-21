package com.mullen.spring.training.exercise4.service;

import com.mullen.spring.training.exercise4.model.CourseRepository;
import com.mullen.spring.training.exercise4.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    CourseRepository repo;


    public List<Course> retrieveData(){
        //repo.findByID(1);
        return null;
    }

    public Course findCourse(long identifier){
       return repo.findByID(identifier);
        //return repo.retrieve().stream().filter(course -> identifier == course.identifier()).findAny().orElse(null);
    }

    public void addCourse(String name, String author) {
        repo.insert(name, author);
    }

}