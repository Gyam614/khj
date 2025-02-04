package study0203;

import java.util.Scanner;

public class study_0203_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		int num = (int)(Math.random()*18
//				
//				); //랜덤값(난수) 나오게 해주는 것: 0.000... ~ 0.999... 
//		System.out.println(num);
//		
		// int 난수범위지정 = (int)(Math.random() * (최댓값-최솟값+1)) + (최솟값);
		// 곱하기 계산과 더하기 계산으로 범위를 지정할 수 있다.
		// 자바스크립트에서도 랜덤값 지정 가능
	
//	
//		int user = 0, coin=0;
//		System.out.print("1.앞면, 2.뒷면: ");
//		user = scan.nextInt();
//		
//		coin = (int)(Math.random()*2+1);
//		if(coin == user) {
//			System.out.println("정답!");
//		
//		}else {
//			System.out.println("땡");
//		}
//		
		
		
		
		// 컴퓨터가 동전을 15개 가지고 있다.
		// 컴퓨터가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임을 만드세요
		// 1.짝 2.홀
		
//		int user=0, coin=0;
//		System.out.print("1.짝, 2.홀: ");
//		user = scan.nextInt();
//		
//		coin = (int)(Math.random()*15+1);
//	
//		if(coin%2==0 && user==1) {
//			System.out.println("정답! 짝이다.");
//		}
//		else if(coin%2==1 && user==2) {
//			
//			System.out.println("정답! 홀이다.");
//		} else {
//			System.out.println("땡!");
//		}
//		System.out.println("동전 갯수: " + coin);
//		
//		
		
		// 주사위게임 (육면체)
		//컴퓨터가 주사위를 던진가.
		// 주사위 값이 3이하라면 작은값 , 주사위값이 4이상이라면 큰값이다.
		// 1. 작다 2.크다
		// 주사위값이 작은 값인지 큰값인지 맞추세요
		
//		int user = 0, dice= 0;
//		System.out.println("1.작은값? 2.큰값? : ");
//		user = scan.nextInt();
//		
//		dice=(int)(Math.random()*6+1);
//		
//		if (user==1 || user==2) {
//			if(dice <= 3 && user==1)
//				System.out.println("정답! 작은 값");
//			else if(dice >=4 && user==2)
//				System.out.println("정답! 큰 값");
//			else
//				System.out.println("땡 :)");
//		} else {
//			System.out.println("잘못 입력하셨습니다."); }
//		
//		System.out.println("주사위 수: " + dice);
//		
		
		
/* 2월 3일 과제
 * 
 * 
 * 		가위바위보 게임 만들기!
 * 		1. 가위 2.바위 3.보
 * 		내가 이겼는지, 졌는지, 비겼는지 출력
 * 
 * 
 * 
 */
		
		
		int user=0, game=0;
		System.out.println("가위바위보!");
		System.out.println("1.가위 2.바위 3.보: ");
		user=scan.nextInt();
		
		game = (int)(Math.random()*3+1);

		
		//가위바위보 게임_유저:가위
		if (user==1) {
			if(game==1) {
				System.out.println("무승부.");
			} else if(game==2) {
				System.out.println("패배.");
			} else {
				System.out.println("승리!");
			}
		//가위바위보 게임_유저:바위
		} else if(user==2) {
			if(game==1) {
				System.out.println("승리!");
			} else if(game==2) {
				System.out.println("무승부");
			} else {
				System.out.println("패배.");
			}
		//가위바위보 게임_유저:보
		} else if(user==3) {
			if(game==1) {
				System.out.println("패배.");
			} else if(game==2) {
				System.out.println("승리!");
			} else {
				System.out.println("무승부.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		} 
		
		//컴퓨터 가위바위보 출력
		if(game==1) {
			System.out.println("컴퓨터: 가위");
		} else if(game==2) {
			System.out.println("컴퓨터: "
					+ "바위");
		} else {
			System.out.println("컴퓨터: 보");
		}
		
		
	}

}
		

