package com.mullen.spring.training.exercise4;

import com.mullen.spring.training.exercise4.model.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExerciseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert("Java Training", "Sam Samson");
        repo.insert("Spring Training", "Joe Joestar");
        repo.insert("Bad Value", "Bad Author");
        repo.deleteByID(repo.findByID(3).identifier());
    }
}
