package study0225;

public class Product { //부모 클래스
	protected boolean onOff = false;
	protected String brand; //브랜드
	protected int price; // 가격
	protected String name; // 제품명 - LG휘센, 캐리어A32 등
	
	
	public void power() {
		onOff = !onOff;
		System.out.println("전원: " + onOff);
	}
	
	public void info(String brand, int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	

}
