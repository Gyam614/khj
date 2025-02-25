package study0225;

public class TV extends Product { //Product의 자식 클래스
	
	public TV() {
		super(); //부모클래스의 생성자 메서드
		//super는 부모클래스의 객체를 의미.
	}
	
	public void tvInfo(String brand, int price, String name) {
		super();
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
		
	}
	
	
