package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = new int[] { 3, 6, 9 };

		try {
			System.out.println(intArray[3]);
		} catch(Exception e) { // 부모로 설정
			System.out.println(e);
		}
		/* 여러개 설정하는 것 가능
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) { 
			System.out.println(e);} 
		*/
		finally {
			System.out.println("finally영역");
		}

	}

}
