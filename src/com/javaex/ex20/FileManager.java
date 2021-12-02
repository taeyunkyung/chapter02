package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	// 필드 - 생략

	// 생성자
	// public FileManager() {} 

	// 메소드 g/s

	// 메소드 일반
	public void readFile() throws IOException { // 해당 메소드를 호출하는 메소드에서 예외를 처리하도록 명시
		
		// c://config.txt 를 읽어오는 메소드
		// System.out.println("파일을 읽었습니다.");
		
		System.out.println("강제예외상황발생");
		throw new IOException(); // 파일을 읽지 못했을 때 예외 발생
	}

	/*
	try	{
		System.out.println("강제예외상황발생");
		throw new IOException(); // 파일을 읽지 못했을 때 예외 발생
	} catch (IOException e)	{
		System.out.println("파일이 없습니다.");}
	*/
}
