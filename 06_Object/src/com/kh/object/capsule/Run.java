package com.kh.object.capsule;

public class Run {

	public static void main(String[] args) {
		// Person 객체 생성
		Person p1 = new Person();
		//p1.name ="홍길동"; // 직접 접근 불가
		p1.setName("홍길동"); // 직접 값을 변경하는것이 아니라
							// setter를 통해 값을 간접적으로 변경
		p1.introduce();
		
		//Person 객체 생성 -> 내 이름, 나이 저장하여 출력해보기
		Person p2 = new Person();
		p2.setName("김성민");
		p2.setAge(35);
		
		System.out.println( p2.getName() );
		
		
	}

}
