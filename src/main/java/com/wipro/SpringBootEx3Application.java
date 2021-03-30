package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEx3Application {
	int e=5;
    static int a=10;
    static final int y=20;
    public void show() {
    	return ;
    }
    
    private static final int c=30;
    private static final int d=30;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx3Application.class, args);
	}

}
