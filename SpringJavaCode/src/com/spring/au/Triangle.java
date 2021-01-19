package com.spring.au;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Triangle {
		
	  public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	private String type; 
	  
	  @Autowired
	  @Qualifier("PointA")
	  private Point pointA;
	  
	  @Autowired
	  @Qualifier("PointB")
	  private Point pointB;
	  
	  
	  //Add Non-Primitive type member variable 
	   	  
	  public Triangle(String type) 
	  { 
		  this.type = type;
	  } 
	   
	  public String getType() { return type; }
	  
	  
	  public void setType(String type) {//setter injection 
		  this.type = type; 
	  }
	  
	  public void draw() {
	  System.out.println(getType()+" Triangle Drawn of type"+getType()+"with points"+getPointA().getX()+""+getPointA().getY()+"PointB "
			  + getPointB().getX()+""+getPointB().getY());
	  }

	
}
