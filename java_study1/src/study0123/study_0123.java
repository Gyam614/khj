package study0123;

import java.util.Scanner;

public class study_0123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		
		// 조건 연산자
		// (조건식) ? 참일 경우 실행 내용 : 거짓일 경우 실행 내용;
		
//		 void a = (10 > 5) ? System.out.println("5보다 크다") :
//						System.out.println("5보다 작다");
		// void : 아무것도 아닌 데이터 타입 
		 
	
//		 int number;
//		 System.out.print("숫자는?: ");
//		number = scan.nextInt();
//		 
//		String result = ( 1 > 5 ) ? "5보다 크다" : "5보다 작다" ;
//		System.out.println(result);
//		
//		int age = 16;
//		int price = (age < 19) ? 1000 : 1500;
//		System.out.printf("나이 : %d살, 버스요금 : %d원 \n", age, price);
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자: ");
//		int num1 = scan.nextInt();
//		
//		System.out.print("두번쨰 숫자: ");
//		int num2 = scan.nextInt();
//		
//		int res = ( num1 > num2 ) ? num1 : num2;
//		// 조건식이 참이라면 res=num1 수행
//		// 조건식이 거짓이라면 res=num2 수행
//		
//		System.out.println("두 숫자 중 큰 숫자는: " + res);
		
		
		// 두 숫자를 입력받아서, 두 수가 같다, 같지 않았다. 출력
		
//		System.out.print("첫번째 숫자는: ");
//		int f_num = scan.nextInt();
//		
//		System.out.print("두번째 숫자는: ");
//		int s_num = scan.nextInt();
//		
//		String resu = (f_num == s_num ) ? 
//				"두 숫자가 같다." : "두 숫자가 같지 않았다.";
//		System.out.println(resu);
//		System.out.printf("첫숫자: %d, 둘숫자: %d \n", f_num, s_num);
		 
		 
//		 System.out.print("정수 입력: ");
//		 int num = scan.nextInt();
//		 
//		 //입력한 정수가 양수냐 음수냐 
//		 
//		 String res = (num > 0) ? "양수" : 
//			 		(num < 0 ) ? "음수" : "0";
//		 
//		 System.out.println(res);

		 
		 //바이킹을 타기 위해선 키가 135 이상이어야 한다.
		 //바이킹 탑승여부를 출력하세요.
		 
		 
//		 System.out.print("당신의 키는: ");
//		 int height = scan.nextInt();
//		 
//		 String viking = (height >= 135) ? "즐거운 시간 되세요!" :
//			 								"탑승하실 수 없습니다.";
//		 
//		 System.out.println(viking);
//		 
//		 System.out.printf("가격: %d원", price);
		 
		 
//		 System.out.print("1.파미향짬뽕 2.쿠켄돈가스 3.공주순대 :");
//		 int select = scan.nextInt();
//		 
//		 int price = (select==1) ? 9000 : 0;
//		 price = (select==2) ? 8000 : price ;
//		 price = (select==3) ? 6500 : price ;
//		 
//		 System.out.println(" 가격은: " + price);

		 
		 // 정수 세 개를 키보드를 통해 입력받기
		 // 세 정수 중 가장 큰 정수를 출력하세요.
		 // 두 개가 같은 경우, 세 개가 같은 경우는 배제!
		 
		 System.out.print("첫 번째 정수: ");
		 int first=scan.nextInt();
		 System.out.print("두 번째 정수: ");
		 int second=scan.nextInt();
		 System.out.print("세 번째 정수: ");
		 int third=scan.nextInt();
		 
//		 
//		 String big = (first > second && first > third) ? "가장 큰 정수는 첫 번째" : 
//			 			(second > first && second > third) ? "가장 큰 정수는 두 번째" :
//			 				(third > first && third > second) ? "가장 큰 정수는 세 번째" : "존재하지 않는다.";
		 
//		 int bignum = (first > second) ? first : (second > third) ? second : third;
		 
		 int max = (first > second) ? first : second;
		 max = ( max > third ) ? max : third;
		 
		 System.out.println("가장 큰 정수는: " + max);
		 
		 
	}

}
