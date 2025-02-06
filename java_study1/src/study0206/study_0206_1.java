package study0206;

import java.util.Scanner;

public class study_0206_1 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do while문
		int a=100;
		do {
			System.out.println("do~while문");
			a++;
		}while(a<15);
		// 초기값 -> {내용} -> 조건식 비교 -> 참이면 -> {내용}
		// 일단 한 번은 내용을 실행한 뒤, 조건식을 비교함.
		
//		int user = 0;
//		while( !(user>=1 && user<=3)) {
//			System.out.println("1.가위 | 2.바위 | 3.보: ");
//		user = scan.nextInt(); }
		
		int user = 0;
		do {
			System.out.print("1.가위 | 2. 바위 | 3.보: ");
			user = scan.nextInt();
			}while(!(user>=1 && user<=3));
		
		
		
		
		
		// == for(int i=1; i<=3; i++)
//		int i=1;
//		int k=1;
//		while (i<=3) {
//			k=1; 
//			//while 반복문의 경우,
//			// k의 값을 i_while문에서 초기화를 시켜줘야 k가 매 i코드실행마다 반복됨.
//			System.out.println("여러분 ㅡ !!");
//			while (k<=2) {
//				System.out.println("🧊🧊얼음!!🧊🧊");
//				k++;
//			}
//			i++;
//		}
		// 우리가 조건 반복문은 for를 사용하는 이유..
		// while보다 for가 훨씬 간결함.. 
		
		
		
//		for(int i=1; i<=3; i++) { 
//			if (i==1) {
//				System.out.println("여러부우운!!");
//			} else if (i==2) {
//				System.out.println("🧊🧊얼으음ㅡ!!🧊🧊");
//			} else {
//				System.out.println("긴장 말아요, 긴장 말아요!!");
//			}
//			for(int k=1; k<=2; k++) {
//				if (i==1) {
//					System.out.println("무슨 일이 있어도!!");
//				} else if (i==2) {
//					System.out.println("제 말을 믿으서야 합니다!!");
//				} else {
//					System.out.println("입 가리라니까, 🧊🧊얼음🧊🧊!!");
//				}
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
