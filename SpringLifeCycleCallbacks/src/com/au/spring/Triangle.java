package com.au.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//import org.springframework.beans.factory.DisposableBean;
//InitializingBean is a marker for spring to call method of bean after initiliazation of bean
//import org.springframework.beans.factory.InitializingBean;


public class Triangle { //implements InitializingBean , DisposableBean 
	@Autowired
	@Qualifier("PointA")
	private Point PointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point PointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point PointC;
	

	public Point getPointA() {
		return PointA;
	}
	
	public void setPointA(Point PointA) {
		this.PointA = PointA;
	}

	
	public Point getPointB() {
		return PointB;
	}
 
	
	public void setPointB(Point pointB) {
		this.PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		this.PointC = pointC;
	}
//   
	
	public void draw() {
		System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getY());
		System.out.println("PointB"+getPointB().getX()+"PointB"+getPointB().getY());
		System.out.println("PointC"+getPointC().getX()+"PointC"+getPointC().getY());
	}
 
	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle bean initialized");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle bean destroyed");
		
	}*/
	
	

	//when we dont want to implement interfaces specific to spring, write own menthods and refer from xml
	public void onInit() {
		System.out.println("Triangle bean initialized");
	}
	
	public void onCleanup() {
		System.out.println("Triangle bean destroyed");
	}

}
