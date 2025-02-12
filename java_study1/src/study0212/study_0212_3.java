package study0212;

import java.util.Scanner;

public class study_0212_3 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] board = new int[][]
				{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				};
				
				
			int x=0, y=0;
			
			
			while(true) {	
				
			//i는 y축, ii는 x축을 표현
			for(int i=0; i<board.length; i++) {
				for(int ii=0; ii<board[i].length; ii++) {
					if(board[i][ii] == 1)
						System.out.printf("■");
					if(board[i][ii] ==0)
						System.out.printf(" ");
					if(board[i][ii] == 2)
						{System.out.printf("□");
					x=ii; y=i;
					}
				}
			System.out.println();
			
			}//화면 그리기 반복문 끝
			
			//이동 시키기 w,a,s,d
			System.out.print("방향 입력: "); 
			char key = input.nextLine().charAt(0);
			
			
			board[y][x] = 0;
			

			switch(key) {
			
			
			case 'w':
				if(board[y-1][x] !=1) 
				y--;
				break;
				
			case 's' :
				if(board[y+1][x] !=1) 
				y++;
				break;
				
			case 'a' :
				if(board[y][x-1] !=1) 
				x--;
				break;
				
			case 'd' :
				if(board[y][x+1] !=1) 
				x++;
				break;
				
			default:
				System.out.println("다시 입력하시오.");
			
			}

			board[y][x] = 2;
	
			
			
			
			
			
			
						
	}	
				
	}		
				
				

}

