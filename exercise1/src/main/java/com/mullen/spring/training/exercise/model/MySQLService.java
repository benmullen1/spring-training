package com.mullen.spring.training.exercise.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQL")
public class MySQLService implements DataService{ 

    public int[] retrieveData(){
        return new int[] {1,2,3,4,5};
    }

}