package com.au.spring;

import java.util.List;

public class Triangle {
	
	private List<Point> points; 
	
	public List<Point> getPoints(){
		return points;
	}
	
	public void setPoints(List<Point> points){
		this.points = points;
	}
	/*private Point pointA;
	private Point pointB;
	private Point pointC;
	
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

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}*/

	
	public void draw() {
		
		for(Point point:points) {
			System.out.println("PointA = "+point.getX()+","+point.getY());
		}
		/*System.out.println("PointA"+getPointA().getX()+"PointA"+getPointA().getX());
		System.out.println("PointB"+getPointA().getX()+"PointB"+getPointB().getX());
		System.out.println("PointC"+getPointA().getX()+"PointC"+getPointC().getX());*/
	}

}
