package com.mullen.spring.training.exercise3.model.dto;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Random;

@Entity
public record Course(
    String name,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    long identifier,
    String author
){
    public Course{
        Objects.requireNonNull(name);
        Objects.requireNonNull(author);
    }

}
