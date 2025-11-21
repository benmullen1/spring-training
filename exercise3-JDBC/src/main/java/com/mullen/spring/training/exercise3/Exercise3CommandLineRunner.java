package com.mullen.spring.training.exercise3;

import com.mullen.spring.training.exercise3.model.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Exercise3CommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.insert("Java Training", "Sam Samson");
        repo.insert("Spring Training", "Joe Joestar");
    }
}
