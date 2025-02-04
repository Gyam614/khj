package study0204;

import java.util.Scanner;

public class study_0204_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int user=0, game=0;
		System.out.println("가위바위보!");
		System.out.println("1.가위 2.바위 3.보: ");
		user=scan.nextInt();
		
		game = (int)(Math.random()*3+1);
		
		
		
		
		switch(user-game) {
		case 0:
			System.out.println("비김");
			break;
		case -2: 
		case 1: 
			System.out.println("이김");
			break;
		case -1: case 2:
			System.out.println("패배");
			break;
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
		
		
		
		
//
//		
//		if(user==game) { //서로 같은 값이면 비김
//			System.out.println("비김.");
//		}else if ((user==1 && game==3) || (user==2 && game==1) || (user==3 && game==2)) {
//			System.out.println("이김!");
//		}else {
//			System.out.println("패배..");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
