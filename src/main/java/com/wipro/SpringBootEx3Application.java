package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEx3Application {
    static int a=10;
    public void show() {
    	return ;
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx3Application.class, args);
	}

}
