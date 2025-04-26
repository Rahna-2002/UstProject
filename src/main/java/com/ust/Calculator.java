package com.ust;

import java.util.logging.Logger;

public class Calculator {
	
	public int add(int i1,int i2) {
		return i1+i2;
	}
	
	public double add(double d1,double d2) {
		return d1+d2;
	}
	
	public String add(String s1,String s2) {
		return s1+s2;
	}
	
	public int add(int i1,int i2,int i3) {
		return i1+i2+i3;
	}
	
	public double add(int i,double d) {
		return i+d;
	}
		
	public double add(double d,int i) {
		return d+i;
	
	}
	
	
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Calculator.class.getName());
		Calculator c=new Calculator();

		logger.info("result:"+c.add(2,3));
		logger.info("result:"+c.add(23.4, 56.78));
		logger.info("result:"+c.add("rahna","shams"));
		logger.info("result:"+c.add(45,67.8));
		

	}

}
