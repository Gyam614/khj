package study0225;

public class Refri extends Product {
	
	public Refri() {
	}

	public Refri(String brand, int price, String name) {
		super(brand, price, name);
	}
	
	
	//부모 클래스가 추상 메서드를 가진 추상 클래스라면
	//자식 클래스에게 추상 메서드를 상속시키기 때문에
	//자식 클래스를 추상 메서드를 가지고 있는 것과 마찬가지가 된다.
	
	@Override 
	public void power() { //추석메서드 구현 
		onOff = !onOff;
		System.out.println("Refri의 전원: " + onOff);
	}

}
