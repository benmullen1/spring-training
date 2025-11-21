package com.mullen.spring.training.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.mullen.spring.training.exercise.service.BusinessCalculationService  	;

@Configuration
@ComponentScan
public class Exercise1Application {

	public static void main(String[] args) {
		System.out.println("Here we go springing again!");
		try (var context = new AnnotationConfigApplicationContext(Exercise1Application.class)) {
			var maxService = context.getBean(BusinessCalculationService.class);
			System.out.println(maxService.findMax());

		} catch (Exception e) {
			System.out.println("Error creating context or running application!");
			System.exit(-1);
		}
		System.out.println("Now that's sprung!");
	}

}
