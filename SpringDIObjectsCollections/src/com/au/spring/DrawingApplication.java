package com.au.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Triangle t = new Triangle();
		ApplicationContext factory = new FileSystemXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		//t.draw();
		
		
	}

}
