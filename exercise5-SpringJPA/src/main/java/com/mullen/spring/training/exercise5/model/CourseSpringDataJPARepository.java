package com.mullen.spring.training.exercise5.model;

import com.mullen.spring.training.exercise5.model.dao.CourseDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepository extends JpaRepository<CourseDAO, Long> {

}
