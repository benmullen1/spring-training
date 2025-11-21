package com.mullen.spring.training.exercise.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mullen.spring.training.exercise.model.DataService;

@Component
public class BusinessCalculationService {

    private DataService service;

    public BusinessCalculationService(DataService service){
      super();
      this.service = service;
    }

    public int findMax(){
		return Arrays.stream(service.retrieveData()).max().orElse(0);
	}


}
