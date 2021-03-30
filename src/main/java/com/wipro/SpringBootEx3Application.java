package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEx3Application {
    static int a=10;
    static final int y=20;
    public void show() {
    	return ;
    }
    
    public void showMessage() {
    	return msg ;
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx3Application.class, args);
	}

}
