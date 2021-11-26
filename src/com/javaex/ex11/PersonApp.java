package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);		
		p01.showInfo();
		
		Student s01 = new Student();
		s01.setName("강동원");
		s01.setAge(35);
		s01.setSchoolName("서울고등학교");
		
		//System.out.println(s01.toString());
		s01.showInfo();
		
		Student s02 = new Student("대전고등학교");
		s02.setName("원빈");
		s02.setAge(38);
		s02.showInfo();
		
		Student s03  = new Student("이정재", 46, "한국고등학교");
		s03.showInfo();
		
	}

}
