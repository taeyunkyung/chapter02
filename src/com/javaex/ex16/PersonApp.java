package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {

		Person s01 = new Student("이정재", 45, "서울고등학교");
		// s01.getSchoolName(); Person이 Student를 가려서 쓸 수 없음
		s01.showInfo(); // 자식 것을 덮어씀 = 이름 겹치는 것 예외적으로 오버라이딩

	}

}
