package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootStrapClass {
	public static void main(String[] args) {
		
		int k=101;
		System.out.println(k);
		SpringApplication.run(BootStrapClass.class, args);
	}
}
