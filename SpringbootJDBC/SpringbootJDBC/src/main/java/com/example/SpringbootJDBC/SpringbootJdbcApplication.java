package com.example.SpringbootJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootJdbcApplication.class, args);
        Student st = context.getBean(Student.class);
		st.setId(111);
		st.setName("anusha");
		st.setTech("Java");

		Studentrepo repo = context.getBean(Studentrepo.class);
		repo.save(st);
		System.out.println(repo.findAll());




	}
}
