package thread2;

import java.util.Random;

public class Customer implements Runnable { //손님
	private Cafe cafe;
	private final String[] menu = {"아메리카노", "키위주스","라떼", "아인슈페너"};
	private final Random random = new Random(); //java 내부에 탑재된 Random 클래스 사용
	
	public Customer(Cafe cafe) {
		this.cafe = cafe;
	}
	
	@Override
	public void run() {
		try {
		while(true) {
			String item = menu[random.nextInt(menu.length)];
			//menu.length까지의 랜덤값을 구하기
			cafe.placeOrder(item);
			Thread.sleep(2000);
		}
			
		} catch(Exception e) {
			
		}
		
	}

}
