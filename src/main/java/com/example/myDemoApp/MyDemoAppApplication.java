package com.example.myDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyDemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyDemoAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
