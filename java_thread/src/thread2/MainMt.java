package thread2;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cafe cafe = new Cafe(); //카페 개장!
		
		Thread barista = new Thread(new Barista(cafe));
		Thread customer = new Thread(new Customer(cafe));
		
		barista.start(); //바리스타 스레드 시작 - 제조할 준비 완료
		customer.start(); //손님 스레드 시작 - 주문할 큰결심
		

	}

}

//카페에서 손님이 주문을 한다.z
//주문을 하면 바리스타(Barista)가 제조한다.
//몇 명의 손님이 주문하든지 주문한 순서대로 바리스타가 제조해야한다.
// 

// Thread 상속 _ 웬만하면 잘 안씀
// Runnable < 이쪽을 많이 씀.
