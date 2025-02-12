package study0212;

import java.util.Scanner;

public class study_0212_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] board = new int[5][3];
		//1차원 배열 몇 개? -> 5개
		
		board[0][0] = 1;     board[0][1] = 2;
		board[0][2] = 3;     board[1][0] = 4;
		board[1][1] = 5;     board[1][2] = 6;
		board[2][0] = 7;     board[2][2] = 10;
		board[3][1] = 20;     board[3][2] = 30;
		board[4][0] = 50;     board[4][1] = 100;
		
//		for(int i=0; i<board.length; i++) {
//			for(int ii=0; ii<board[i].length; ii++) {
//				System.out.println(board[i][ii]);
//			}
//		}
		
		for(int[] pArr : board) {
			//pArr에 저장되는 것은 board[0~4]
			//board[0] -> 메모리주소
			for(int num : pArr) {
				//num에 저장되는것은 board[0][0~4], board[1][0~4]. . .
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
