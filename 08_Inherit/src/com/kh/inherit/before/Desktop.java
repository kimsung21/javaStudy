package com.kh.inherit.before;

/*
 * 상속 : 부모 클래스의 멤버(필드, 메소드)를 자식 클래스에서
 * 		그대로 이어받아 사용하는것
 * 		실제 상속된 클래스를 톨해 객체 생성시 부모 클래스의 멤버들도 생성
 * 
 * * 장정
 *  - 적은 양의 코드로 새로운 클래스를 정의하고 사용할수 있다(생산성이 좋다)
 *  - 코드를 공통으로 관리하기 떄문에 코드의 추가나 수정이 용이함(유지 보수성이 좋다)
 *  
 * * 특징
 * 	-부모클래스의 생성자는 상속되지 않음
 *  -부모클래스의 private 멤버는 상속은 되지만, 직접 접근 불가
 *  -모든 클래스는 Object 클래스의 후손
 *  => 자바에서 이미 만들어진 클래스, 직접 만든 클래스
 *  = 클래스 간의 상속은 "단일 상속"만 가능( 다중상속 불가 => 부모는 하나)
 *  -부모클래스의 정의 되어있는 메소드를 자식 클래스에서 재정의 할수 있음
 *  =>오버라이딩
 *  
 */
//-------------------------------
/*
 * Desktop 클래스
 * -----------------------------
 * -vrand:String
 * -code:String
 * -name:String
 * -price:int
 * -allInOne:boolean
 * -------------------
 * +Desktop(brand:String, code:String 
 *  , name:String, price:int, allInone:boolean
 *  +infomation
 * 
 */

public class Desktop {
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	
	public Desktop(String brand, String code, String name, 
					int price, boolean allInOne) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	public String information() {
		//return "brand:"+brand +", code: "+ code +", name: ";
		//* String.format(포맷,..... ):String
		return String.format("brand: %s, code: %s, name: %s, price: %d, allInOne: %b", brand, code,name,price,allInOne);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() { // =>getter
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
}
