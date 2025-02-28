package study0225;

public class TV extends Product { //Product의 자식 클래스
	
	public TV() {
		super(); //부모클래스의 생성자 메서드
		System.out.println("자식클래스 생성");
		//super는 부모클래스의 객체를 의미.
	}
	
	public TV(String brand, int price, String name) {
		super(brand, price, name);
	}
	
	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("TV의 전원: " + onOff);
	}
	
	//오버라이딩
	//상속관계인 경우, 인터페이스implements인 경우에 사용
	
	//성립 조건
	// 1. 메서드의 원형은 그대로 유지(아무것도 바뀌면 안됨!!!!)
	// 2. 내용만 변경
	// 3. 상속 또는 implements인 경우에만 가능
	
	
		
	}
	
	
