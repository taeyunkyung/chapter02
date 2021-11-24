package com.javaex.ex06;

public class Math {

	// 필드 -> 생략

	// 생성자 -> 디폴트 생성자 사용

	// 메소드 g/s -> 생략

	// 메소드 일반
	public int plus(int num01, int num02) { // 사례 1. plusInt plucDouble로 이름 분리
		int sum = num01 + num02;
		return sum;
	}

	public double plus(double num01, double num02) { // 사례2. 동일해도 메소드 오버로딩
		double sum = num01 + num02;
		return sum;
	}

	public double plus(int num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}

	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}
}
