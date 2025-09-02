package com.kh.object.basic;

public class Run {

	public static void main(String[] args) {
		//정의해둔 Person 클래스 사용
		//=> 사용하기 위해선 객체를 생성해야 함
		
		//* 변수 선언 : 클래스명 변수명;
		Person p1; // 선언만 했을 경우, 변수는 null 값을 가지고 있는 상태일 것
		
		// * 객체 생성 (인스턴스 생성) 및 할당
		// 	변수명 = new 클래스명(); => 클래스명() : 생성자
		p1 = new Person("임수진",20);
		
		//* 인스턴스 변수에 접근 : 변수명. 필드명;
		
		
		//*인스턴스 메소드에 접근 : 변수명.인스턴스메소드명()
		p1.introduce();
		
		//*선언과 할당을 동시에
		Person p2 = new Person("김성민",35);
		p2.name = "김성민";
		p2.age = 35;
		
		p2.introduce();
		
		Person p3 = new Person("아이유", 33);
		p3.introduce();
	}

}
