package com.spring.au;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) throws IOException {
	
		ApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml"); 	      
//				///SpringDemo/spring.xml
	    Triangle triangle = (Triangle)factory.getBean("triangle");//bean id
	//t.draw();
		triangle.draw();
//		
	}

}
