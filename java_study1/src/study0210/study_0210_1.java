package study0210;

import java.util.Scanner;

public class study_0210_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//너 다 잘해놓고 for문에서 int 빼먹었어..
		//등신아..
		
//		int num = 12345;
//		for(int i=1; i<=5; i++) {
//			int digit = num%10;
//			num = num/10;
//			System.out.println("추출된 숫자: " + digit);
//		}
		
		//변수: 값(데이터, 주소 등등)을 저장하기 위한 메모리 공간
		int num = 11;
		//배열: 같은 데이터 타입의 연속적인 메모리 공간
		// 			다른말로 -> 변수 공간 여러개를 연속적으로 사용
		
		//자바스크립트 배열 -> let arr = []; let arr = mew Array(); const arr = [1, 2, 3, 4];
		
		int[] arr = new int[5];
		int[] arr2 = new int[] {1, 20, 50, 15}; //4개 공간 배열 선언
		String[] greeting = new String[] {"hello", "nice", "to", "meet", "U"};
		
		//자바 배열 사용법
		
		arr[2] = 20; //arr 배열의 '세 번째' 공간에 20 저장
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 60;

		System.out.println(arr); //배열의 주소를 출력
		System.out.println(arr[0] + ", " + arr[2]);
		System.out.println(greeting[0] + "! " + greeting[4]);
		
		for(int i=0; i<=4; i++) {
			System.out.println( arr[i] );
		} 
		// 배열 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		//배열 내의 값 조회는 반복문을 사용하는게 좋다.
		//i_반복문의 초기값은 인덱스(index)첫순서(0)으로 지정.
		// 반복문의 조건식은 배열인덱스의 마지막까지 표현될 수 있게 하자.
			// ex) 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7 | 조건식은 i<=7 하면 된다.
		
		
		for(int i=0; i<=3; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] apple = new int[10];
		// 참조변수를 사용하려면 배열인경우 인덱스를, 객체인 경우는 ._접근연산자를
		// 쌤: new가 붙어있는건 웬만하면 다 '참조변수'.
//		Scanner : 
		// Scanner 라는 이름의 클래스 타입.
		
		for(int i=0; i<=9; i++) {
			System.out.print("숫자 임력: ");
			apple[i] = sc.nextInt();
		}
		
		for(int i=0; i<apple.length; i++) {
			System.out.println("배열값" + (i+1) + ": " + apple[i]);
		} //i(초기값)의 범위를 배열.length로 표현하려면 <= 가 아닌 < 로 해야함!! (.length는 [배열칸수]가 되기 때문)
		  //실수데이터는 정확도가 100%가 아니라 잘못 처리될 수도 있다. 
		  // 배열의 크기는 반드시 10진수 정수 양수로 지정!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
