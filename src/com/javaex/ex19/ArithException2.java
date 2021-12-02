package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {

		double result;
		int num;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		try {
			result = 100 / num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			// 예외상황 유무와 상관없이 출력됨, 생략가능
			System.out.println("finally영역");
		}

		sc.close();
	}

}
