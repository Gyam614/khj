package generic3;

public class 포스틱 extends Snack {
	
	protected 포스틱(String snackName, int price) {
		super(snackName, price); 
	}
	
	@Override
	public String toString() {
		return " 포스틱 | 과자 이름: " + snackName + ", 가격: " + price;
	}

}
