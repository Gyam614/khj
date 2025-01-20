package test_20250120;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/* 사과상자에 사과가 20개 들어있따.
 * 오렌지 상자에 오렌지가 15개 들어있다.
 * 사과 상자는 11개, 오렌지 상자는 12개 있다면,
 * 과일은 총 몇 개 인가?
 * (출력결과는 친절하게!)
 * 
 * (과일 맛있겠다..)
 */
	
int abox = 20;
int obox = 15;
int total_abox = abox * 11;
int total_obox = obox * 12;
int total = total_abox + total_obox;

System.out.println("과일은 총 : " + total);

// 20250120 과제 끝 //


System.out.println("출력하는 방법");
/* 자바에서 키보드를 통해 데이터 입력하는 법:
 * 자바에서 입력하기 위한 순서.
 * 1. 입력 객체 생성
 * 2. 입력 객체를 통해 데이터에 맞는 입력 메서드 호출 
 */

//Scanner 변수이름
Scanner input = new Scanner(System.in);


//num이라는 변수에 정수 데이터 입력하여 저장하기:
//nestInt()가 정수 데이터 입력하기 위한 메서드이다.
int num = input.nextInt();

	}

}
