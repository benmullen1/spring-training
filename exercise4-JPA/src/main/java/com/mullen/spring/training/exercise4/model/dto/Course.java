package com.mullen.spring.training.exercise4.model.dto;

import jakarta.persistence.*;

import java.util.Objects;


public record Course(
    String name,
    Long identifier,
    String author
){
    public Course{
        Objects.requireNonNull(name);
        Objects.requireNonNull(author);
    }

}
