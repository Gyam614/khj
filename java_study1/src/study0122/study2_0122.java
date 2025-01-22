package study0122;

import java.util.Scanner;

public class study2_0122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교연산자 - 두 개 데이터를 비교하여 참, 거짓 결과
		
		System.out.println(10 > 5);
		System.out.println(11 < 4);
		
		
		Scanner scan = new Scanner (System.in);
		
		int num;
		
		System.out.println("정수 입력: ");
		num = scan.nextInt();
		
		System.out.println("5보다 큰 숫자인가?: " + (num >5)); //기준값에 괄호 쳐주기.
		boolean big;
		big = num >= 10;
		
		System.out.println("10 이상인 숫자인가?: " + big);
		
		System.out.println(10==10); //두 숫자가 같다.
		System.out.println(10==13); // => 거짓
		
		String word="가나다"; // 문자열 타입은 String 클래스 타입 (기본은 아님)
		String word2 = new String("가나다");
		
		// System.out.println(word == word2); // => 적용 안됨 / 자바스크립트에선 됨.. 
		System.out.println(word.equals(word2));
		//문자열이 가장 많이 다루어지는 데이터 타입임. 관련 연산자는 외워서라도 머리에 넣기.
		
		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별

		
		System.out.println(10!=5);
		
		//놀이동산에 가서 바이킹을 타는데 키가 140 이상만 탈 수 있음.
		
		int tall;
		System.out.print("키: ");
		tall = scan. nextInt();
		System.out.println(tall >= 140);
		
		// 바이킹 탑승조건 : 키 140 이상 190 이하
		
		System.out.println(tall >=140 && tall <= 190);
		// System.out.println(140 <= tall <= 190); => 비교 데이터 타입 불일치!
		
		
		//청소년 버스 요금은 1000원이다. (청소년은 13세부터 19세)
		// 나이를 입력받아서 청소년이면 false, 아니면 true가 출력되게 하시오.
		
		int age;
		System.out.print("나이: ");
		age = scan.nextInt();
		System.out.println(age<13 || age>19);
		
		//청소년이 true값이 나오게 하려면: 
		//		System.out.println(!(age<13 || age>19));
		//			ㄴ 복잡하게 생각할 것 없이, 부정문 !을 사용해서 반대의 경우를 출력
		
		
		
		//조건식 - 비교연산자와 논리 연산자를 이용하여 만든식
		// 조건식 만드는 연습 해야함.....................................................
		// total > count
		
	}

}
