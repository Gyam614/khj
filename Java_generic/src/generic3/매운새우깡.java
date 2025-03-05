package generic3;

public class 매운새우깡 extends Snack {
	
	protected 매운새우깡(String snackName, int price) {
		super(snackName, price); }
	
	@Override
	public String toString() {
		return " 매운새우깡 | 과자 이름: " + snackName + ", 가격: " + price;
	}

}
