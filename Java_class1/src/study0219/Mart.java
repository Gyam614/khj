package study0219;

public class Mart {

	String name; //상품명
	String brand; //상품 브랜드
	int quan; //상품 수량
	
	
	Mart(){}; // 기본 생성자메서드
	
	Mart(String name, int quan){
		this.name = name;
		this.quan = quan;
	}
	
	Mart(String name, String brand, int quan){
		this.name = name;
		this.brand = brand;
		this.quan = quan;
	}
	
}

