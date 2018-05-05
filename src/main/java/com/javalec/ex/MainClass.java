package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator();
		
		
		System.out.println(m.getFirstNum());
		System.out.println(m.getSecondNum());
		System.out.println(m.getCalculator());
		
		m.setCalculator(new Calculator());
		
		
		
		m.setFirstNum(10);
		m.setSecondNum(2);
		
		m.add();
		m.sub();
		m.mul();
		m.div();
		
	}

}