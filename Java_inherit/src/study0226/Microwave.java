package study0226;

import study0225.Product;

public class Microwave extends Product { //전자레인지
	//다른 패키지의 부모 클래스에 상속시키려면 import 필수!
	
	public Microwave() {
		System.out.println(super.brand );
	}

	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("Computer의 전원: " + onOff);
	}

	
}
