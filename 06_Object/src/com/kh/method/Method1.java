package com.kh.method;

public class Method1 {

	public static void main(String[] args) {
		System.out.println("====프로그램 시작====");
		hiEveryone(20);
		hiEveryone(10);
		
		//hiEvertone(); // => 매개변수가 없는 hiEveryone 메소드는 존재할수없음
		
		System.out.println("====프로그램 종료====");
	}
	public static void hiEveryone(int age) {
		//반환 형 : void => "결과값이 없음"을 의미함
		// 메소드명 : hiEveryone
		// 매개변수 정보 : 1개. 정수형 age 변수.
		// => 메소드가 호출될 떄 전달되는 값을 저장할 공간
		
		System.out.println("Hi Everyone!");
		System.out.println("age: " );
	}
	
}
