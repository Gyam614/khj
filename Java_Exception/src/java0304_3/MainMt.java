package java0304_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	예외처리 - 코드실행에 있어서 예외적인 부분을 처리하기 위한 방법
		 	예외적 상황이 발생하는 것은 올바른 실행이 이루어지지 않아서
		 	오류 또는 에러가 발생한다.
		 	(오류: 코드 상의 오류_아무튼내탓임 | 에러: 개발자가 해결못할 수도 있음 
		 	자바에서 예외처리는 오류에 대한 처리이다.
		 	예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다.

		 */
		
//		int a; 
//		System.out.println(a+10); << 이건 에러 처리
		int a = 10;
		Scanner sc = new Scanner(System.in);
		
		try { //오류가 예상되는 코드를 try{}에 작성한다.
			
			System.out.print("a 변수 입력: ");
			a = sc.nextInt();
			
			System.out.println("나누기 전 ");
			System.out.println(a/2); // << 이것도 오류임
			
		} catch(ArithmeticException e) { //try에서 가져온 문제를 catch가 잡아가는것.
			System.out.println("0으로 나누면 안돼!");
			
			// try 구문에서 오류가 발생하면 catch 구문이 실행된다.
			// catch 구문이 실행되려면 발생한 오류를 처리할 수 있는 클래스를
			// 가지고 있어야 한다.
			//클래스 명은 잡을 에러명(-Exception)
		} catch(InputMismatchException i) {
			System.out.println("정수 입력을 해!");
		}
								// 0으로 나누기하면 오류남..
		
		System.out.println("프로그램 종료");
	}

}
