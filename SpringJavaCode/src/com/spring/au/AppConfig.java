package com.spring.au;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="triangleObj")
	public Triangle getTriangle() {
		return new Triangle("Equilateral");
	}
	
	@Bean(name="pointObj")
	public Point getPoint() {
		return new Point(10,20);
	}

}
