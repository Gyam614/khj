package study0218;

import java.util.Scanner;

public class study_0218_1 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Member a = new Member(); //<괄호는 메서드 호출!
//		a.name = "아몬드브리즈";
//		a.age = 19000;
//		a.job = "무가당_아몬드유";		
//		System.out.println(a.name + " " + a.age + " " + a.job);
		
		
//String names = new String[3];
		
//		Member[] members = new Member[5];
//		//5명의 정보 저장 가능..은 한데 아직..
//		for(int i=0; i<members.length; i++) {
//			members[i] = new Member(); // (반복문 써서) members라는 1차배열에 마련된 하나하나의 참조변수 공간에 변수공간을 선언_마련!
//		}
//		
//		members[0].name = "난오류야";
//		members[0].job = "오류티비";
//		members[0].age = 1;
//		
//		members[1].name = "배고프다";
//		members[1].job = "PMS";
//		members[1].age = 5;
//		
//		members[2].name = "집에 가고 싶다";
//		members[2].job = "토끼같은 유자가 기다리는데";
//		members[2].age = 900;
//		
//		
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name + " | " + members[i].job + " | " + members[i].age);
//		}
	
		
		
		
		/* 영화제목, 장르, 관객수, 개봉년도
		 
		 */
		
		Movie minfo = new Movie();
		
		minfo.title = "장발장";
		minfo.genre = "드라마";
		minfo.visit = 900000;
		minfo.openDate = 20250219;
		
		
		System.out.println(minfo);
		System.out.println(minfo.title + " | " + minfo.genre  + " | " + minfo.visit  + " | " + minfo.openDate);
		
		
		// 생성자 메서드
		// 생성자 메서드는 자바에서 클래스 정의할 때
		// 기본 생성자 메서드도 같이 만들어진다.
		// 눈에 보이지 않게 생략 처리된 것이지 없는 것은 아님.

//		Member info = new Member();
//		System.out.println(info);
//		
//		System.out.println( info.name );
//		
//		Member m1 = new Member();
//		System.out.println( m1.name );
		
		
		Member info = new Member(20, "군인"); //메서드 내 지정된 매개변수의 순서에 맞춰 입력하기.
		
		System.out.println( info.job );
		
		
		
		
		
		
		
		
		
		
	}

}

