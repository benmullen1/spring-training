package com.mullen.spring.training.exercise3.service;

import com.mullen.spring.training.exercise3.model.CourseJDBCRepository;
import com.mullen.spring.training.exercise3.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    CourseJDBCRepository repo;


    public List<Course> retrieveData(){
        //return new int[] {12,22,32,42,52};

        return repo.retrieve();
    }

    public Course findCourse(long identifier){
        return repo.retrieve().stream().filter(course -> identifier == course.identifier()).findAny().orElse(null);
    }

    public void addCourse(String name, String author) {
        repo.insert(name, author);
    }

}