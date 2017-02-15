package com.nacre.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {

	
public	MyBean(){
		
		System.out.println("Obj");
	}
	

public void PrintHrllo() {
	System.out.println("hello");
}
}
