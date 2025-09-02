package com.kh.inter.ex1;

public class Mouse implements Animal, Baby{

	@Override
	public void move() {
		// 움직일수 없음 System.out.println();
	}

	@Override
	public void eat() {
		System.out.println("쥐는 호랑이 시체를 먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("찍-- 찍--");
	}
	
	

}
