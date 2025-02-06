package study0205;

import java.util.Scanner;

public class study_0205_hw {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// 20250205 과제
		// 업다운 게임: 내 제시한 정수에 맞춰 컴퓨터도 범위를 좁혀갈 수 있도록 설정.


//			System.out.print("정수 입력: ");
//			int num = scan.nextInt();
//			
//			
//			while(true) {
//				int com = (int)(Math.random()*29+21);
//				if(com == num ) {
//					System.out.println("정답.");
//					break;
//				} if(com>num) {
//					System.out.println("업.");
//				} else if(com<num) {
//					System.out.println("다운.");
//				}
//			}
//			
			

	System.out.println("==== UP & DOWN GAME (VS COM) ====");	
	System.out.print("1~50 중 하나를 입력하세요.: ");
	int number = scan.nextInt(); //내가 입력한 숫자를 컴퓨터가 맞춘다.
	
	int max = 50, min=1, t=50; //t변수는 random*t로 사용
	//최대값, 최소값을 변수로 선언해주기
	
	while(true) {
		System.out.println("범위: " + min +"~" + max);
		int com = (int)(Math.random()*t + min); //20
		System.out.println("COM: " + com);
		
		if(number == com) {
			System.out.println("정답!");
			break;
		}
		if(number > com) {
			System.out.println("UP");
			min = com+1;
			t = max - com;
		}
		if(number < com) {
			System.out.println("DOWN");
			max = com-1; //범위 좁혀주기
			t = max - min + 1; //다운인 경우, 범위의 최대값 변경
		}
		
	}
		
		
		
	}

}
