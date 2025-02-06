package study0206;

import java.util.Scanner;

public class study_0206_2 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 문제 1 - 무한루프
		 
		 	정수 1개씩 계속 입력받기
		 	입력하다가 0을 입력하면
		 	지금까지 입력한 모든 숫자의 합 출력
		 	
		 문제 2 - 무한루프
		 
		 	컴퓨터와 가위바위보 게임하기
		 	내가 10번을 이길 때까지 계속 게임하기.
		 	10번 이기면 그동안 몇 번 패배하고 몇 번 비겼는지 출력
		 	
		 문제 3 
		  컴퓨터와 주사위 게임을 한다.
		  각각 주사위 2개를 던져서 주사위 합이 큰 쪽이 이긴다.
		  단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		  둘이 같은 숫자가 나왔다면 합이 큰 쪽이 이긴다.
		  예) 나 = 3,4 컴1,3 / 내가 이김.
		  	  나 5,6 컴1,1 / 컴퓨터 이김
		  5판 진행했을 때 몇승 몇패 몇무인지 입력
		  
		 
		 
		 */
		
		
		//1. 
		
//		int sum = 0;
//		
//		while(true) {
//			System.out.print("정수 입력: ");
//			int num = scan.nextInt();
//			
//			sum+=num;
//			
//			if(num==0) {
//				System.out.println("총합은: " + sum);
//				break;
//			}
//		}
//		
//		
//		//2.
//		
//		int win = 0;
//		int lose = 0;
//		int draw = 0;
//		int game = 0;
//		
//		System.out.println("\r==== 가위 바위 보! ====");
//		do {
//			
//			System.out.print("1.가위 | 2.바위 | 3.보자기: ");
//			int user = scan.nextInt();
//			
//			game = (int)(Math.random()*3+1);
//			
//			
//			switch(user-game) {
//			case 0:
//				
//				System.out.println("💥무승부💥");
//				draw++;
//				break;
//			case -2:
//			case 1:
//				if(user==0 || user>3) {
//					System.out.println("잘못된 숫자입니다");
//					
//					break;
//				}
//				System.out.println("❤승리❤");
//				win++;
//				break;
//			case -1: case 2:
//				if(user==0 || user>3) {
//					System.out.println("잘못된 숫자입니다");
//					break;
//				}
//				System.out.println("💧패배💧");
//				lose++;
//				break;
//			
//			} 
//	
//			
//			if(game==1) {
//				System.out.println("컴퓨터: 가위");
//			} else if(game==2) {
//				System.out.println("컴퓨터: 바위");
//			} else {
//				System.out.println("컴퓨터: 보");
//			}
//			System.out.println("현재 승리 횟수: " + win);
//			System.out.println("======================\r");
//			
//			} while(win!=10);
//		
//		System.out.println("10번 승리!");
//		System.out.println("무승부 횟수: "+ draw);
//		System.out.println("패배 횟수: "+ lose);
//		
		
		
		
		
		
	//3.
		
		
	int myDicef = 0;
	int myDices = 0;
	int comDicef = 0;
	int comDices = 0;
	int diceGame = 0;
	
	int dwin=0;
	int dlose=0;
	int ddraw=0;
	
	
	System.out.println("==== 주사위 게임 5판전!! ==== \r");
	
int start=0;
	
	System.out.print("게임 시작 - 숫자 0을 누르면 시작됩니다: ");
	start = scan.nextInt();
	
	
	System.out.println("======================"
			+ "");
	
	

	
	if(start==0) {
	for(int i=diceGame; i<5; i++) {
		myDicef = (int)(Math.random()*6+1);
		myDices = (int)(Math.random()*6+1);
		comDicef = (int)(Math.random()*6+1);
		comDices = (int)(Math.random()*6+1);
		
		int myDice = myDicef + myDices;
		int comDice = comDicef + comDices;
		
		System.out.println("내 주사위: " + myDicef + ", " + myDices);
		System.out.println("컴퓨터 주사위: " + comDicef + ", " + comDices);
		
		
		//두 유저의 두 주사위가 같을 경우 >> 
		if(myDicef == myDices && comDicef == comDices) {
			
			// - 두 유저의 두 주사위가 같을 경우: 내 합이 더 큰경우
			if(myDice > comDice) {
				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
				System.out.println("❤!럭키 다이스!❤");
				System.out.println("❤승리❤");
				System.out.println("======================\r");
				dwin++; }
			
			// - 두 유저의 두 주사위가 같을 경우: 컴퓨터의 합이 더 큰 경우
			else if(myDice < comDice) {
				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
				System.out.println("💧!럭키 다이스!💧");
				System.out.println("💧패배💧");
				System.out.println("======================\r");
				dlose++; }
			
			//- 두 유저의 두 주사위가 같을 경우: 합조차 똑같을 경우
			else {
				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
				System.out.println("💥무승부💥");
				System.out.println("======================\r");
				ddraw++;
			} }
		
		  //내 두 주사위 눈이 같을 경우
			else if(myDicef == myDices) {
			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
			System.out.println("❤!럭키 다이스!❤");
			System.out.println("❤승리❤");
			System.out.println("======================\r");
			dwin++;
			
		  //컴퓨터의 두 주사위 눈이 같을 경우
		} else if(comDicef == comDices) {
			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
			System.out.println("💧!럭키 다이스!💧");
			System.out.println("💧패배💧");
			System.out.println("======================\r");
			dlose++; }
			
		  //내 주사위 합이 더 클 경우
		else if(myDice > comDice) {
			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
			System.out.println("❤승리❤");
			System.out.println("======================\r");
			dwin++;
			
		  //컴퓨터의 주사위 합이 더 클 경우
		} else if(myDice < comDice) {
			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
			System.out.println("💧패배💧");
			System.out.println("======================\r");
			dlose++;
			
		 //나와 컴퓨터 주사위 합이 같을 경우
		} else {
			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
			System.out.println("💥무승부💥");
			System.out.println("======================\r");
			ddraw++;
		}
	} 

	System.out.println("===주사위 게임 끝!===");
	System.out.println("승리 횟수: " + dwin + "\r" + "패배 횟수: " + dlose);
	System.out.println("무승부 횟수: " + ddraw); }
	else if(start!=0) {
		System.out.println("F11을 눌러 새로고침한 뒤, 0을 눌러 게임을 시작해주세요.");
	}
		
		
		
		
		
		

// 3.테스트용:같은값판정테스트
	
//	for(int i=diceGame; i<5; i++) {
//		System.out.print("내 첫번째 주사위: ");
//		myDicef = scan.nextInt();
//		System.out.print("내 두번째 주사위: ");
//		myDices = scan.nextInt();
//		System.out.print("컴의 첫번째 주사위: ");
//		comDicef = scan.nextInt();
//		System.out.print("컴의 두번째 주사위: ");
//		comDices = scan.nextInt();
//		
//		int myDice = myDicef + myDices;
//		int comDice = comDicef + comDices;
//		
//		System.out.println("내 주사위: " + myDicef + ", " + myDices);
//		System.out.println("컴퓨터 주사위: " + comDicef + ", " + comDices);
//		
//		if(myDicef == myDices && comDicef == comDices) {
//			if(myDice > comDice) {
//				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//				System.out.println("❤!럭키 다이스!❤");
//				System.out.println("❤승리❤");
//				System.out.println("======================\r");
//				dwin++; }
//			else if(myDice < comDice) {
//				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//				System.out.println("💧!럭키 다이스!💧");
//				System.out.println("💧패배💧");
//				System.out.println("======================\r");
//				dlose++; }
//			else {
//				System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//				System.out.println("💥무승부💥");
//				System.out.println("======================\r");
//				ddraw++;
//			} }
//			else if(myDicef == myDices) {
//			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//			System.out.println("❤!럭키 다이스!❤");
//			System.out.println("❤승리❤");
//			System.out.println("======================\r");
//			dwin++;
//		} else if(comDicef == comDices) {
//			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//			System.out.println("💧!럭키 다이스!💧");
//			System.out.println("💧패배💧");
//			System.out.println("======================\r");
//			dlose++; }
//			
//		else if(myDice > comDice) {
//			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//			System.out.println("❤승리❤");
//			System.out.println("======================\r");
//			dwin++;
//		} else if(myDice < comDice) {
//			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//			System.out.println("💧패배💧");
//			System.out.println("======================\r");
//			dlose++;
//		} else {
//			System.out.println("내 주사위합: " + myDice + " | COM의 주사위합: " + comDice);
//			System.out.println("💥무승부💥");
//			System.out.println("======================\r");
//			ddraw++;
//		}
//	} 
//
//	System.out.println("===주사위 게임 끝!===");
//	System.out.println("승리 횟수: " + dwin + "\r" + "패배 횟수: " + dlose);
//	System.out.println("무승부 횟수: " + ddraw); 
//
//
//		
		
		
		
		
		
		

	}

}
