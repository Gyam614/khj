package study0220;

import java.util.Scanner;

public class study_0220_1 {

	static void output() {
		System.out.println("반환도 없고");
		System.out.println("매개변수도 없는 메서드");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//반환이 있고 매개변수 필요없는 메서드 - int num = scan.nextInt();
	//매개변수가 필요 없기 때문에 자체적으로 필요한 데이터를 생성할 수 있거나
	//클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공(계산같은것)하여
	//외부로 내보내기 위한 목적인 경우
	
	
	static int total() {
		int a=10, b=20, c=30;
		int tot = a+b+c;
		return tot;
	}
	
	
	
	static Scanner scan = new Scanner(System.in);
	
	
	// 두 개의 정수 중 큰 값 출력하는거 만들기
	// 두 정수 비교하고 출력하는 메서드 필요
	// 반환 없고 매개변수 있는 메서드로!
	
	//반환이 없으면 보이드
	//매개변수 두 개를 넣어주기
	static void cmp( int a, int b ) {
		if(a>b)
			System.out.println("큰수: " + a);
		else 
			System.out.println("큰수: " + b);
	}
	
	//국어점수: 88, 영어점수: 91, 수학점수: 74
	//세 과목의 총점과 평균을 출력
	//총점 계산 메서드, 평균 계산하는 메서드
	
	static int sum(int k, int e, int m) {
		int sum = k + e + m;
		return sum;
	}
	
	static void avg(int sum) {
		int avg = sum/3;
		System.out.println("평균: " + avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//매개변수가 있던 자리에 숫자를 입력하고
		//정수를 비교, 출력하는 메서드 호출!
		
		cmp(109, 43);
		
		
		int kor = 88, eng=91, mat=74;
		int totScore = sum(kor,eng,mat);
		System.out.println("총점: " + totScore);
		avg(totScore);
		
		
		
		

	}

}
