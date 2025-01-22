package study0122;

import java.util.Scanner;

public class study1_0122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20; // 대입연산자에 의해 오른쪽 값을 왼쪽에 저장
		num=20+3+1*10; //+, * 연산 후 대입연산 실행
		int num2 = 10, num3 = 55; // 한 줄에 여러 변수를 지정해줄 수 있음.
		
		num  = num2 + 13 / num3 + 123;
		// 대입 연산자는 다른 연산자들보다 우선순위가 낮음 
		
		// 우선순위 1위 : ( ) 
		//			2위 : [ ]
		//			3위 : . (접근연산자)
		//			4위 : => (화살표)
		
		
		//사칙연산자
		System.out.println(num2 + num3); // +
		System.out.println(num2 - num3); // -
		System.out.println(num2 * 4); // *
		System.out.println(num2 + num3 * 2 ); //* 연산 후 + 연산
		System.out.println(num3 / num2); // /연산은 몫
		System.out.println(num3 % 4); // %연산은 나머지
		
		System.out.println(10 / 3.0); 
		System.out.println(10 % 3.0);
		
		//복합 대입 연산자
		num = 10;
//		num = num + 20; => + 수행 후 = 수행하는 순서
		num += 20;
		//num2 = num2 * 5
		num2 *= 5; 
		//복합 대입 연산자의 조건 : 대입되는 변수와 계산되는 변수가 같아야만 성립이 됨
		
		//num = num + 5 * num3;
		num += 5 * num3;
		
		Scanner scan = new Scanner(System.in); //키보드 입력을 받기 위해 생성 
		
		//원의 둘레 구하기
		int r=0, dist=0;
		System.out.print("반지름: " );
		r= scan.nextInt();
		
		float pi = 
				3.14f;
		dist = (int)(r * 2 * pi);
		
		System.out.println("원의둘레: " + dist);
//		dist = (int)(r * 2 * 3.14); //강제 타입 변환_3.14로 인해 나오는 값이 실수인 것에 비해, 지정된 dist는 정수 타입이기 때문.
	}

}
