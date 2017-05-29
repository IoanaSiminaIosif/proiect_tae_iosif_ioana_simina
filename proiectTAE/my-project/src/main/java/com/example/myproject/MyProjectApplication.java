package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

/**
 * 
 * @author Simina Iosif
 *
 */

@SpringBootApplication
public class MyProjectApplication extends WebMvcAutoConfiguration{

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
}
