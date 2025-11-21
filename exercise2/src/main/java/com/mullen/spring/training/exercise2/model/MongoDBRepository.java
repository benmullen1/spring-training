package com.mullen.spring.training.exercise2.model;

import com.mullen.spring.training.exercise2.model.dto.Course;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Repository
@Primary
@Qualifier("MongoDB")
public class MongoDBRepository implements DataService{

    private ArrayList<Course> courses = new ArrayList<Course>(){
        {
            add(new Course("Spring Training", "100", "Bob Bobbers"));
            add(new Course("React Training", "200", "Jim Jimmers"));
            add(new Course("Algol Training", "101", "Steve Stevers"));
            add(new Course("Aardvark Training", "201", "Booba Tooba"));
        }
    };

    public Course[] retrieveData(){
        //return new int[] {12,22,32,42,52};

        return courses.toArray(Course[]::new);
    }

    public Course findCourse(String identifier){
        return courses.stream().filter(course -> identifier.equals(course.identifier())).findAny().orElse(null);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

}