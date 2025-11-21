package com.mullen.spring.training.exercise.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Component
@Primary
@Qualifier("MongoDB")
public class MongoDBService implements DataService{ 

    public int[] retrieveData(){
        return new int[] {12,22,32,42,52};
    }

}