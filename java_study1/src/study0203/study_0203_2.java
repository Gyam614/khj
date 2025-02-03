package study0203;

import java.util.Scanner;

public class study_0203_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//switch (마우스 드래그, 메뉴)
		//if문과 같은 조건문
		//if: 조건에 범위가 있는 경우에 사용
		
		
		//일반적인 switch문의 형태
//		switch(3
//				) {
//		case 1:
//			System.out.println("1을 선택");
//			break;
//		case 3:
//			System.out.println("3을 선택");
//			break;
//		case 10:
//			System.out.println("10을 선택");
//			break;
//		} //break: 강제 종료 언어 | break를 붙여 필요한 case만 불러오기.
			// switch문 안에 또다른 if문과 또다른 switch문 입력 가능
			// case에는 '문자'나 특수문자도 가능. !!그러나 실수는 안됨!
			//	ㄴ 다만 case문에 들어간 타입에 맞춰 switch문도 같은 타입으로 입력해야함.
			// 		(switch문에 들어간 case문 데이터 종류가 각자 다르면 안됨!)
		
		
		
		
		int num = 90;
		switch(num) {
		case 10:
			System.out.println("10 선택");
			break;
		case 30:
			System.out.println("30할거야?");
			break;
		case 20:
			System.out.println("case에 표현하는 데이터는 정수, 뭄ㄴ자, 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case 실행은 " + "break 또는 } 까지 실행");
			break;
		default:
			System.out.println("case에 존재하지 않는 값이야! 다시해!");
		}
		
		//default: case에 존재하지 않는 값을 출력시키는 언어
		
		
		
	}

	
	}

