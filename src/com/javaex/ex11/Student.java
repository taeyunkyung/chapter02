package com.javaex.ex11;

public class Student extends Person {

	// 필드
	private String schoolName;

	// 생성자
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		/*
		 * super(); 부모생성자 실행, 써주지 않아도 실행됨, super (name, age); -> 가능 
		 * super.setName(name); super.setAge(age); -> 가능 
		 * super.name = name; super.age = age; -> 오류 
		 * 부모 필드 -> protected로 설정하면 접근 가능
		 */
		super.name = name; // protected이면 사용 가능
		super.setAge(age); // private일 떄
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	// 메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 일반
	@Override
	public String toString() { // inherited fields 체크
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}

	public void showInfo() { // 부모 자식간 똑같은 이름이 있으면 자식 쪽이 실행됨
		System.out.println("*************************");
		System.out.println("이름: " + super.name);
		System.out.println("나이: " + super.age);
		System.out.println("학교: " + this.schoolName);
		System.out.println("*************************");
	}
	
}
