package com.kh.operator;

public class A_Arithmetic {
	/*
	 * 산술 연산자 (이항 연산자) => +,-,*,/,%
	 * 
	 * 우선순위: * , /, % > +, -
	 */
	
	public static void main(String[] args) {
		Method1();
	}
	
	public static void Method1() {
		//정수형 변수 n1 선언하고, 10을 대입
		int n1 = 10;
		// 정수형 변수 n2에 3을 대입
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		
		System.out.println("n1 - n2 = " + (n1 - n2));
		// * +와 -는 우선순위가 동일 => 왼쪽 연산자 먼저 수행됨!
		System.out.println("n1 * n2 = " + (n1 * n2));
		// * 연산자가 + 보다 우선순위가 높음! => ()를 생략해도 됨!
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		
		// 나머지 연산(%) => 짝수/홀수 판별
		//* 짝수 : (변수 % 2 ==0)
		//* 홀수 : (변수 % 2 !=0)
		
		System.out.println("n1은 짝수인가? " + (n1 % 2 == 0));
		System.out.println("n2는 짝수인가? " + (n2 % 2 == 0));
		
		
	}

}
