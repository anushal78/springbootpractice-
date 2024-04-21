package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		
		Student st = context.getBean(Student.class);
		st.show();
		
//		Student st1 = context.getBean(Student.class);
//		st1.show();
	}

}
