package com.spring.au;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(value = "prototype")
public class Triangle {
		
	  private String type; 
	  
	  @Autowired
	  private Point pointA;
	 	  
	  public Triangle(String type) 
	  { 
		  this.type = type;
	  } 
	   
	  public String getType() { return type; }
	  
	  
	  public void setType(String type) {//setter injection 
		  this.type = type; 
	  }
	  
	  public void draw() {
	  System.out.println(getType()+" Triangle Drawn of type"+getType()+"with Point"+getPointA().getX()+","+getPointA().getY());
	  }

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	 
}
