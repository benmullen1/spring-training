package com.mullen.spring.training.exercise2;

import com.mullen.spring.training.exercise2.model.DataService;
import com.mullen.spring.training.exercise2.model.DataServiceConfiguration;
import com.mullen.spring.training.exercise2.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ExerciseController {

    @Autowired
    DataService service;

    @Autowired
    DataServiceConfiguration config;

    @RequestMapping("/courses")
    public Course[] retrieveAllCourses(){
        return service.retrieveData();
    }

    @GetMapping("/course")
    @ResponseBody
    public Course findCourse(@RequestParam(required = false) String identifier){
        if (identifier != null){
            return service.findCourse(identifier);
        }
        else{
            return null;
        }
    }

    @PutMapping("/course")
    public Course addCourse(@RequestParam String name, @RequestParam String author){
        Course newCourse =new Course(name, Course.generateID(), author);
        service.addCourse(newCourse);
        return newCourse;
    }

    @GetMapping("/topCourse")
    @ResponseBody
    public Course findTopCourse(){
        return Arrays.stream(service.retrieveData()).min(Comparator.comparing(Course::name)).orElse(null);
    }

    @RequestMapping("/config")
    public DataServiceConfiguration getConfig(){
        return config;
    }


}
