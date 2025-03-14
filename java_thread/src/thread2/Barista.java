package thread2;

public class Barista implements Runnable {
	private final Cafe cafe; //바리스타가 일하는 카페
	
	//final(상수)를 붙이는 이유: 값이 변경되지 않게 하기 위해서.
	//final에 값을 넣어줄 수 있는 것은 오직 초기화 단계 뿐.
	
	public Barista(Cafe cafe) { //바리스타가 일하는 카페를 넣어줘야 주문을 받지!
		this.cafe = cafe; //생성자 메서드를 통한 상수값 초기화
	}
	
	@Override
	public void run() {
		try {
		while(true) {
			Order order = cafe.give();
			System.out.println("바리스타 제조: " + order.getOrderId() +
							" - " + order.getMenu());
			
			Thread.sleep(3000); //그냥 주문 시간 설정만 한 것. nullPointer랑 상관없음.
			System.out.println("바리스타 음료 제작 완료!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
