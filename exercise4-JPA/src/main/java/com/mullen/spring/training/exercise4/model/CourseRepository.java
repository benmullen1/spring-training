package com.mullen.spring.training.exercise4.model;

//import com.mullen.spring.training.exercise4.model.dto.Course;
import com.mullen.spring.training.exercise4.model.dao.CourseDAO;
import com.mullen.spring.training.exercise4.model.dto.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    private EntityManager manager;

    public void insert(String name, String author){
        CourseDAO newCourse = new CourseDAO(name, null, author);
        newCourse = manager.merge(newCourse);
    }



    public Course findByID(long identifier){
        return manager.find(CourseDAO.class, identifier).getCourse();
    }

    public void deleteByID(long identifier){
        manager.remove(manager.find(CourseDAO.class, identifier));
    }


}
