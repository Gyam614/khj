package study0207;

import java.util.Scanner;

public class study_0207_hw {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 
		 - 문제 7. -알파벳 찾기(반드시 반복문 사용)
		 알파벳 (대문자 또는 소문자 모두 가능하게) 입력
		 입력한 알파벳이 몇 번째 알파벳인지 찾기 - 반드시 for문으로
		 
		  */
		
		//7.
		
	
		
		/*
		 
		 과제 : 숫자 야구
		 1~9 중의 임의의 숫자 3개를 뽑아낸다. (중복X)
		 3개의 숫자를 맞추기 해야한다.
		 예) 임의의 숫자 - 7 1 8
		 입력: 1 2 3
		 결과 : 0스트라이크 1볼 2아웃
		 입력: 4 7 9
		 결과: 0스트라이크 1볼 2아웃
		 입력: 4 1 8 
		 결과: 2스트라이크 0볼 1아웃
		 
		 스트라이크: 숫자도 자리도 맞는 것
		 볼: 숫자는 맞으나 자리가 틀린 것
		 아웃: 숫자도 자리도 틀린 것
		 
		 
		 */
		
		
		//과제:
		
		System.out.println("\r==⚾==⚾==⚾==⚾===\"⚾숫자 야구⚾\"==⚾==⚾==⚾==⚾==\r");
		
		
		while(true) {
		
		//컴퓨터의 임의 3숫자 출력
		int comA = (int)(Math.random()*9+1);
		int comB = (int)(Math.random()*9+1);
		int comC = (int)(Math.random()*9+1);
		
		//숫자 중복XX
		if (comA!=comB && comA!=comC && comB!=comC)  {
			
//		System.out.println("[ 컴퓨터의 숫자: " + comA + ", " + comB + ", " + comC + " ]"); // => 게임 테스트용
				
		// 턴 수 카운트
		int turn = 1;
			
				// 게임 코딩: 
				while(true) {
					
					//게임 룰(strike, ball, out 변수 선언)
					int strike = 0;
					int ball = 0;
					int out = 3;
					
					
					//유저의 숫자 입력
					System.out.println("\r========== " + turn++ + "번째 턴 ==========");
					System.out.print("숫자를 입력해주세요(띄어쓰기로 숫자 구분): ");
					int meA = sc.nextInt();
					int meB = sc.nextInt();
					int meC = sc.nextInt();
					
						//유저가 숫자를 잘못 입력했을 때: 
						if((meA>9 || meA==0) || (meB>9 || meB==0) || (meC>9 || meC==0)) {
						System.out.println("잘못 입력하셨습니다."); 
						turn = turn-1;
						} 
												
					 //strike
						if(meA==comA) strike++;
						if(meB==comB) strike++;
						if(meC==comC) strike++;
						
					 //ball
						if (meA==comB || meA==comC) ball++;
						if (meB==comA || meB==comC) ball++;
						if (meC==comA || meC==comB) ball++;
						
					 //out
						out = out-(strike+ball);
					
			
				     //정답을 맞췄을 경우: 
						if ((meA == comA) && (meB == comB) && (meC==comC)) {
							System.out.println("\r==⚾==⚾==⚾==⚾==⚾\"정답입니다!!\"⚾==⚾==⚾==⚾==⚾==\r");
							System.out.println("[ 컴퓨터의 숫자: " + comA + ", " + comB + ", " + comC + " ]");
							System.out.println("걸린 턴 수: " + (turn-1));
							break;
						} 
						//오답일 경우: (strike, ball, out 출력)
						else { 
							// > 입력된 숫자가 잘못된 경우: 
							if((meA>9 || meA==0) || (meB>9 || meB==0) || (meC>9 || meC==0)) 
							{System.out.println("");}
							// > 올바르게 입력된 경우: 
							else
							 System.out.println("결과: " + "STRIKE:[" + strike + "] | BALL:[" + ball + "] | OUT:[" + out + "]");
							 
							
							} }
				//게임 종료 시 루프 종료
				break;}
						
		
		
		
	

		
		
		

	}
				
	}

	}
