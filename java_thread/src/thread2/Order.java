package thread2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor //final 붙어있는 변수의 생성자 메서드 생성
public class Order { //주문을 접수하는 클래스.
	private static int counter = 1;
	private final int orderId; //주문번호
	private final String menu; //주문 메뉴

	public Order(String menu) {
		this.orderId = counter++;
		this.menu = menu;
	}
}
