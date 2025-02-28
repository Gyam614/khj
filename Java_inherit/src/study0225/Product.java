package study0225;

public abstract class Product { //부모 클래스
	protected boolean onOff = false;
	protected String brand; //브랜드
	protected int price; // 가격
	protected String name; // 제품명 - LG휘센, 캐리어A32 등
	
	public Product() {
//		System.out.println("부모클래스 생성");
	}
	
	public Product(String brand, int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
	
	public abstract void power(); //추상메서드
	//자식클래스에서 오버라이딩하기 때문에
	//부모는 추상적인 메서드로 만들기만 하면 됨.
	//자식클래스에 오버라이딩할 때 abstract는 굳이 넣어주지 않아도 됨.
	//추상메서드가 존재하려면.. 반드시 추상클래스에서만 가능.
	
	//추상 클래스는 객체 생성이 불가
	//		ㄴ 어짜피 굳이? 부모클래스로 객체를 생성할 일이 없음.
	//추상 클래스는 추상 메서드를 가질 수 있는 클래스다.
	// 추상 메서드는 메모리의 크기를 얼마나 할당해야하는지
	// 측정 불가이기 때문에,
	// 객체 공간 할당이 안된다.
	// 객체 공간 할당 받으려면 얼마의 메모리가 필요한지
	// 측정이 되어야 한다.
	

}
