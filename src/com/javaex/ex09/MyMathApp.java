package com.javaex.ex09;

public class MyMathApp {

	public static void main(String[] args) {
		
		int sum01 = MyMath.plus(6, 4); // static 영역 사용
		System.out.println(sum01);
		
		double sum02 = MyMath.plus(4.6, 5.3);
		System.out.println(sum02);
		
		double sum03 = MyMath.plus(7, 8.8);
		System.out.println(sum03);
		
		double sum04 = MyMath.plus(2.1, 10);
		System.out.println(sum04);
		
		double sum05 = MyMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = MyMath.circle(4);
		System.out.println(sum06);	
				
		/*
		MyMath myMath = new MyMath();
		
		int sum01 = myMath.plus(5, 4);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(4.4, 3.7);
		System.out.println(sum02);
		
		double sum03 = myMath.plus(3, 5.5);
		System.out.println(sum03);
		
		double sum04 = myMath.plus(9.1, 2);
		System.out.println(sum04);
		*/
	}

}
