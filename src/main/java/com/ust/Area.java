package com.ust;

import java.util.logging.Logger;

public class Area {
	 public static Logger logger=Logger.getLogger(Area.class.getName());

	
	public double area(double x) {
		logger.info("square area");
		return 4*x;
	}
	
	public double area(double l,double b) {
		logger.info("rectangle area");
		return l*b;
	}
	
	public float area(float r) {
		logger.info("circle area");
		return 3.14f*r*r;
	}
	
	public float area(float b,float h) {		
		logger.info("triangle area");
		return 0.5f*b*h;
	}
		
	
	public static void main(String[] args) {
	
		Area a=new Area();

		logger.info("result:"+a.area(2f,2f));
		logger.info("result:"+a.area(5.5));
		logger.info("result:"+a.area(3.4,5.5));
		logger.info("result:"+a.area(4f));
		

	}

}
