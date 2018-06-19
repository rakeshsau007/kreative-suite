package io.org.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.org.springbootstarter")
public class CourseApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(CourseApi.class, args);
		
	}

}
