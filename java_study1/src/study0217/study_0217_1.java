package study0217;

import java.util.Scanner;

public class study_0217_1 {

	static Scanner scan = new Scanner(System.in)
			;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int[] game = new int[25];
		
		// game배열에 값 채우기 + 중복제거
		for(int i=0;i<game.length;i++) {
			game[i] = (int)(Math.random()*50+1);
			for(int k=0; k<i; k++) {
				if(game[k] == game[i]) {//배열의 값 중 temp와 같은게 있다면
					i--; break;
				}
			}
		}
		
		
while(true) {
			
			
			// -------------빙고판 출력하는 코드-----------
			System.out.println("┌───┬───┬──┬───┬───┐");
			
			for(int i=0;i<=4;i++) { // 얘는 줄바꿔주는 용도
				for(int k=0;k<=4;k++) { // 옆으로 몇개를 출력할건가
					
					if(game[i*5+k] == 0)
						System.out.printf(" %2s ", "■");
					else
						System.out.printf(" %2d ", game[i*5+k]);
				}
				System.out.println();
			}
			
			System.out.println("└───┴───┴──┴───┴───┘");
			
			//-----------숫자를 받아오겠다----------
			System.out.print("숫자 입력:");
			int num = scan.nextInt(); // 빙고판에 있는 숫자 입력
			
			for(int i=0;i<game.length;i++) {
				if(game[i] == num) { // 내가 입력한 숫자를 배열에서 찾기
					game[i]=0; // 내가 찾은 숫자를 0으로 표시
				}
							
			}
			
			int bingo = 0;
			int row=0, col=0, cross1=0, cross2=0;
				
				
			for(int i=0;i<=4;i++) { 
				for(int k=0;k<=4;k++) { 
					if(game[i*5+k] == 0) row++;
					if(game[k*5+i]==0) col++;
					}
				if(game[i*6]==0) cross1++;
				if(game[i*4+4]==0) cross2++;
				
				
				if(row==5) bingo++;
				if(col==5) bingo++;
				if(cross1==5) bingo++;
				if(cross2==5) bingo++;
				
				//제발 너무 어렵게 생각하지 말기. 
				//신중하게.
				// 
				
				row=0;
				col=0;
				
				
				}
			System.out.println("현재 빙고: " + bingo + "빙고!");
			
			if (bingo==5) {
				System.out.println("5줄 빙고 끝!!");
				
			
			
			
			}
			
			
			
			
			
			
			} //while칸




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
