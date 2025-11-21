package com.mullen.spring.training.exercise5.service;

import com.mullen.spring.training.exercise5.model.CourseRepository;
import com.mullen.spring.training.exercise5.model.CourseSpringDataJPARepository;
import com.mullen.spring.training.exercise5.model.dao.CourseDAO;
import com.mullen.spring.training.exercise5.model.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    //JPA style
//    @Autowired
//    CourseRepository repo;


    //Spring Data JPA style
    @Autowired
    private CourseSpringDataJPARepository repo;

    public List<Course> retrieveData(){
        //repo.findByID(1);
        List<CourseDAO> courseDAOS =  repo.findAll();
        ArrayList<Course> courses = new ArrayList<Course>();
        for(CourseDAO courseDao: courseDAOS){
            courses.add(courseDao.getCourse());
        }
        return courses;
    }

    public Course findCourse(long identifier){
        try {
            return repo.findById(identifier).get().getCourse();
        } catch (Exception e) {
            return null;
        }
    }

    public void addCourse(String name, String author) {
        CourseDAO newCourse = new CourseDAO(name, author);
        repo.save(newCourse);
    }


    public void deleteCourse(long identifier){
        try {
            repo.delete(repo.findById(identifier).get());
        } catch (Exception e) {
            //throw new RuntimeException(e);
        }
    }

}