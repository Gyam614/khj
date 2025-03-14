package thread1;

public class MyThread extends Thread{ //java 내부에 Thread클래스가 따로 존재한다.

	//스레드를 생성하여 동작되게 하려면 run 메서드가 필요하다.
	//기존의 프로그램(프로세스)는 main 메서드부터 시작
	@Override
	public void run() {
		System.out.println("스레드 시작!");
		for(int i=1; i<=10; i++) {
			
			System.out.println( i + "새로운 스레드 출력");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


//스레드 구현 방법 
// 1.Thread 클래스 상속
// 2. Runnable 인터페이스 구현