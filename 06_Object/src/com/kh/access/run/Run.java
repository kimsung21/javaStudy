package com.kh.access.run;

import com.kh.access.AccessTest;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		AccessTest test = new AccessTest();
		
		// puvlic 멤버 접근
		System.out.println( test.publicField );
		test.publicMethod();
		
		// protected 멤버 접근
		//System.out.println( test.protectedField);
		//test.protectedMethod();
		
		// default 멤버 접근
		//System.out.println(test.defaultField);
		//test.defaultMethod();
		
		//private 멤버 접근
		//System.out.println(test.privateField);
		//test.privateMethod();
		
	}

}
