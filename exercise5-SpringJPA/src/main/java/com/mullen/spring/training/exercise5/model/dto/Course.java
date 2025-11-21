package com.mullen.spring.training.exercise5.model.dto;

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
