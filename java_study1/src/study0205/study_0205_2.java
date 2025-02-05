package study0205;

import java.util.Scanner;

public class study_0205_2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//for(초기값; 조건식; 증감식)
		
//	while(조건식) { }
//		int i=1; //초기값
		
//for(int i=1; i<=10; i++) = 
//		while(i<=10) { //조건식
//			System.out.println(i);
//			i++; //증감식
//		}
		
		
//반복횟수가 정해져있는 경우 for문이 가독성이 좋다.
//반복횟수가 없는 경우 while문이 가독성이 좋다.
		
		
//		int com = (int)(Math.random()*29+21);
//
//		
//		
//		
//		while(true) {
//			System.out.print("정수 입력: ");
//			int num = scan.nextInt();
//			if(com == num ) {
//				System.out.println("정답.");
//				break;
//			} if(com>num) {
//				System.out.println("업.");
//			} else if(com<num) {
//				System.out.println("다운.");
//			}
//		}
//		
		
	// 20250205 과제
	// 업다운 게임: 내 제시한 정수에 맞춰 컴퓨터도 범위를 좁혀갈 수 있도록 설정.


//		System.out.print("정수 입력: ");
//		int num = scan.nextInt();
//		
//		
//		while(true) {
//			int com = (int)(Math.random()*29+21);
//			if(com == num ) {
//				System.out.println("정답.");
//				break;
//			} if(com>num) {
//				System.out.println("업.");
//			} else if(com<num) {
//				System.out.println("다운.");
//			}
//		}
//		
//		
	
		//동전 앞면 뒷면 맞추기 게임
		// 내 돈이 바닥날 때까지 게임 진행.
		
		System.out.print("잔액: ");
		int money = scan.nextInt();
		final int 판돈=1000;
		int win=0;
		
		while(true)	{
			int coin = (int)(Math.random()*2+1); // 1앞 2뒤
			System.out.println("1.앞면, 2.뒷면: ");
			int user = scan.nextInt();
			if (user == coin) {
				
				System.out.println("정답!");
				win++;
			}			else
				System.out.println("오답.");
				System.out.println("동전은: " + coin);
				
			
			money -= 판돈; //1번 진행시 1천원씩 감소
			if (money < 판돈) break;
			
		}
		System.out.println("현재 잔액: " + money + "\r잔액이 부족합니다.");
		System.out.println("맞춘 횟수: " + win);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
