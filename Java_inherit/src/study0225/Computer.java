package study0225;

public class Computer extends Product {
	
	public Computer() {
	}

	public Computer(String brand, int price, String name) {
		super(brand, price, name);
	}
	
	@Override //@:컴퓨터에게 알려주는 주석_해주는게 좋다.
	public void power() {
		onOff = !onOff;
		System.out.println("Computer의 전원: " + onOff);
	}

}
