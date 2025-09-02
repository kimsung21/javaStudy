package com.kh.operator;

import java.util.Scanner;

public class D_Triple {
	/*
	 * 삼항연산자
	 * 
	 * 		조건식 ? 조건의 결과가 true인 경우 사용할 값(식)
	 * 			 : 조건의 결과가 false인 경우 사용할 값(식);
	 */

	public static void main(String[] args) {
		mathod1();
		
	}
	
	public static void mathod1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0); // 이어서 작성 가능 권장하지는 않음
		
		//입력된 값이 'x'  또는 'X'인 경우
		// "종료합니다." 출력하고, 그렇지 않으면 "계속 진행합니다." 출력
		
		String result = ch == 'x' || ch == 'X' ? "종료합니다.":"계속 진행합니다.";
		
		System.out.println(result);
		
		
		
		
	}

}
