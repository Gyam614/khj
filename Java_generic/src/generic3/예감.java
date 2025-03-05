package generic3;

public class 예감 extends Snack {
	
	protected 예감(String snackName, int price) {
		super(snackName, price); }
	
	@Override
	public String toString() {
		return " 예감 | 과자 이름: " + snackName + ", 가격: " + price;
	}

}
