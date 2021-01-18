package com.spring.au;

public class Triangle {
	
	/*public void draw() {
		
	}*/

	
	  private String type; 
	  private int height;
	  
	  public Triangle(String type) 
	  { 
		  this.type = type;
	  	  } 
	  public Triangle(int height) { 
		  this.height = height;  
	  }
	  
	  public Triangle(String type,int height) 
	  { 
		  this.type = type; 
		  this.height =	height;	  
	  }
	  
	  public int getHeight() { return height; }
	  
	  public String getType() { return type; }
	  
	  
	  public void setType(String type) {//setter injection 
		  this.type = type; 
	  }
	  
	  public void draw() {
	  System.out.println(getType()+" Triangle Drawn with height "+getHeight()); }
	 
}
