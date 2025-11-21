package com.mullen.spring.training.exercise2.model.dto;

import java.util.Objects;
import java.util.Random;

public record Course(
    String name,
    String identifier,
    String author
){
    public Course{
        Objects.requireNonNull(identifier);
    }

    public static String generateID(){
        Random rand = new Random();
        return Integer.valueOf(rand.nextInt()).toString();
    }
}
