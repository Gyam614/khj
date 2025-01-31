package study0131;

import java.util.Scanner;

public class study_0131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);

/*
 변수: 데이터(값)을 저장하기 위한 메모리 공간
 변수 이름: 데이터가 저장된 메모리 공간을 사용하기 위해서는 이름을 부여해야 한다. 
 
System.out.println(1000); : 메모리(램) 어딘가에 임의로 저장된 '1000'이란 숫자를 출력.
int a=1000; : a라는 변수(메모리공간)에 '1000'이란 데이터를 저장.
System.out.println(a); :'1000' 데이터가 저장된 a라는 변수를 출력.

변수 선언: 데이터 타입 정하기, 변수 이름 정하기
		-> 사용할 데이터에 맞춰서 정하기
		-> int num; 데이터 타입 변수이름;
		
데이터타입 변환(형변환)
자동 형변환 : 데이터타입이 작은 범위에서 큰 범위로 데이터가 저장되는 경우
		ex) float a = 10; : 정수보다 실수가 더 큰 데이터 타입 _10이 실수 타입으로 자동 형변환됨.
강제 형변환 : 데이터 타입이 큰 범위에서 작은 범위로 데이터가 저장되는 경우
		ex) int b = 2.14f; << 자동 형변환이 이루어지지 않음.XX
				ㄴ int b = (int)2.14f; : 괄호 안에 강제 형변환할 타입 입력
				

나누기 % : 나머지값 구하기
나누기 / : 몫값 구하기
++, -- : 증감연산자 (1씩 증가, 1씩 감소) 



 if(조건식) { 조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행.
 			참일 경우 실행할 내용, 여러줄 가능.
 			}
 			if (조건식) {
 			
 			} else { else는 조건식이 거짓일 경우에만 실행.
 					거짓일 경우 실행할 내용, 여러 줄 가능
 					}
 				
*/

//	int 나이 = 25;
//	if ( 나이 >= 19) {
//		System.out.println("성인입니다.");
//	} else {
//	System.out.println("청소년입니다.");
//	}
//	
//	int money = 6400;
//	if (money >= 10000 ) {
//		System.out.println("충전 안함");
//	}else {
//		System.out.println("잔액 부족. "
//				+ "" + (10000-money)+"원 충전");
//		money = (10000 - money) + money;
//	}
//	
//	System.out.println("현재 잔액 : " + money + "원");
	
	
	// 사각형의 너비와 높이이다.
	// 현재 사각형은 정사각형인가 직각 사각형인가?
//	int width = 52, height = 52;
//	
//	if (width == height) {
//		System.out.pr
//		intln("정사각형입니다."); }
//	else {
//		System.out.println("직각 사각형입니다.");
//	}
//	
	
//	int num=0;
//	System.out.print("숫자입력: ");
//	num = scan.nextInt();
//	
//	if( num % 2 == 1) { System.out.println("홀수입니다.");
//		
//	} else {
//		System.out.println("짝수입니다.");
//	}
	
	
//	System.out.print("숫자입력: ");
//	
//	
//	int num=scan.nextInt();
//	if(num > 0) {
//		System.out.println("양수이다.");
//	} else if(num==0) {
//			System.out.println("0이다.");
//		} else 
//			System.out.println("음수이다.");
//		
//	
//	
//	int score = 31; //100~90은 A, 89~80은 B, 79~70은 C
//					//나머지는 F
//	
//	if (score <=100 && score >=90) {
//		System.out.println("A학점이다."); }
//	else if (score >=80) {
//		System.out.println("B학점이다."); }
//	else if (score >= 70) {
//		System.out.println("C학점이다."); }
//	else {
//		System.out.println("F학점이다.");
//	}
	
	//1 입력하면 데이터 저장이라고 출력
	//2 입력하면 데이터 삭제 라고 출력
	//3 입력하면 종료라고 출력
	//1,2,3이 아니라면 
	
	System.out.print("메뉴를 선택: ");
	int num=scan.nextInt();
	if (num==1) {
		System.out.println("데이터 저장");
	} else if (num==2) {
		System.out.println("데이터 삭제");
	} else if (num==3) {
		System.out.println("종료");
	} else 
		System.out.println("잘못 입력하셨습니다.");
	
	
	
	}
	
	
	
	}
	
