package com.javaex.ex19;

public class NullPointerException {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		
		try {
			str = null; // 주소를 없앰
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("주소값이 없습니다.");
		}

	}

}
