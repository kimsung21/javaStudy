package com.kh.loop;

public class A_For {
	/*
	 * 반복문 : 프로그램 흐름을 제어하는 문법 중 하나로
	 * 		특정코드를 반복적으로 수행
	 * 
	 * *for 문
	 * [표현식]
	 * 
	 * 			for(초기식;조건식;증감식){
	 * 			 //반복적으로 수행할 코드;
	 * 			}
	 * 
	 * 	*초기식 : 반복문이 수행될때 "최초" 한번만 실행하는 식
	 *  *조건식 : 반복문이 "수행될 조건"을 작성하는 식
	 *  	-조선식의 결과가 true일 때 중괄호 안의 내용을 실행
	 *  	-조건식의 결과가 false일 때 반복문 종료
	 *  *증감식 : 반복문을 제어하는 변수의 값을 증감시키는 식
	 *  
	 *  [for문 실행 순서]
	 *  	초기식 -> 조건식 검사 -> 결과가 true인 경우 반복할 내용 수행 -> 증감식 수행
	 *  		->조건식 검사 -> 결과가 true인 경우 반복할 내용 수행 ->증감식
	 *  --------- 계속 반복--------------
	 *  		->조건식 검사 -> 결과가 false인 경우 반복문 종료
	 *  * 참고 : 초기식, 조건식, 증감식은 생략 가능!
	 *  		=>세미콜론();은 반드시 작성해야 함!!
	 *  	-증감식 생략 => for(초기식;조건식;){}
	 *  	-조건식 생략 => for(초기식;;증감식){}
	 *  	-초기식 생략 => for(;조건식;증감식){}
	 *  	-모두 생략 => for(;;) {}
	 *  
	 */

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
		
	}
	/*
	 * for문 사용해서 happy 5번 출력
	 */
	public static void method1() {
		/*for(int i=0; i<5; i++) {
			System.out.println("Happy");
		}*/
		for(int i=1; i<6; i++) {
			System.out.println("Happy");
		}
	}
	public static void method2() {
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
	}
	public static void method3() {
		//총합을 저장할 변수
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			//1 ~ 10까지 총합
		 //total = total + i;
			total += i;//누적 합산식
		}
		System.out.println("1부터 10까지 총 합 : "+ total);
	}
	/*
	 * 랜덤값을 추출하여 1부터 그 값까지의 총 합
	 */
	public static void method4() {
		/*
		 * [랜덤값을 구하는 방법]
		 * -Math :java.lang.Math
		 * 	Math.random() 호출하여 사용
		 * 			0.0 ~ 0.99999( 0.0 <= 랜덤값 <1.0 )
		 * 
		 * ex)1부터 10까지의 랜덤값 추출
		 * 		Math.random() * 10
		 * 		Math.random() *10 + 1 => 
		 * 		(int)(Math.random() * 10 + 1) => 1 ~ 10
		 */
		int random = (int)(Math.random() * 10 + 1);
		
		// 1부터 random 값 까지의 총 합
		int total = 0;
		
		for(int i = 1; i <= random; i++) {
			
			total += i;
			
	    }
		System.out.printf("1부터 %d까지의 총 합 : %d\n",random,total);

	}
	public static void method5() {
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println(dan + "단");
			
			for(int n=1; n<=9; n++) {
				//해당 단의 결과 출력
				System.out.printf("%d X %d = %d\n", dan, n, dan*n);
			}
		}
	}
}	
