package com.mullen.spring.training.exercise5;

import com.mullen.spring.training.exercise5.service.DataService;
import com.mullen.spring.training.exercise5.model.RepositoryConfiguration;
import com.mullen.spring.training.exercise5.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ExerciseController {

    @Autowired
    DataService service;

    @Autowired
    RepositoryConfiguration config;

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){

        return service.retrieveData();
    }

    @GetMapping("/course")
    @ResponseBody
    public Course findCourse(@RequestParam(required = false) String identifier){
        if (identifier != null){
            try{
                long idValue = Long.parseLong(identifier);
                return service.findCourse(idValue);
            }
            catch (NumberFormatException ex){
                return null;
            }

        }
        else{
            return null;
        }
    }

    @PutMapping("/course")
    public void addCourse(@RequestParam String name, @RequestParam String author){
        service.addCourse(name, author);
    }

    @GetMapping("/topCourse")
    @ResponseBody
    public Course findTopCourse(){
        return service.retrieveData().stream().min(Comparator.comparing(Course::name)).orElse(null);
    }

    @RequestMapping("/config")
    public RepositoryConfiguration getConfig(){
        return config;
    }

    @DeleteMapping("/course")
    public void deleteCourse(@RequestParam String identifier){
        try {
            service.deleteCourse(Long.parseLong(identifier));
        } catch (NumberFormatException e) {
            //throw new RuntimeException(e);
        }
    }


}
