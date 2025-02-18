package study0217;

import java.util.Arrays;
import java.util.Scanner;

public class study_0217_2 {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub


 		/* 
 		 문제 4.
 		 	도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다.
 		 	도서관에서 여러 사람들이 책을 대출하며 각 사람은 여러 권의 책 대출 가능.
 		 	
 		 	- 각 사람이 대출한 책의 제목을 배열로 저장하고
 		 	그 사람의 대출 내역을 출력하는 프로그램을 작성하시오. -
 		 	
 		 	 조건:
 		 	  1. 도서관엔 3명의 이용자가 있고, 최대 5권까지 대출
 		 	  2. 각 이용자의 이름과 대출한 책 제목을 출력
 		 	  
 		 	  # 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고
 		 	  	배열 선언시 초기값 지정해도 됨.

 		 
 		 */
		
		
//		String[][] library = new String[3][5];
//		
//		for(int i=0; i<library.length; i++) {
//			System.out.println("==============================\r");
//			System.out.print("이용자의 이름을 입력해주세요: ");
//			String user = scan.nextLine();
//			
//			library[i][0] = user;
//			
//			for(int b=0; b<library[i].length; b++) {
//				System.out.print("'" + user + "' 님이 대출한 책 제목을 입력해주세요: ");
//				String book = scan.nextLine();
//				
//				library[i][b] = book;
//				
//				if(book=="끝") break;
//				 }
//			
//		}
//		
//		
//		
//		for(int i=0; i<library.length; i++) {
//			System.out.println("---------------------\r");
//		System.out.println(i + "번째 사용자 이름: " + library[i][0] + " ");
//			for(int b=0; b<library[i].length; b++) {
//				System.out.println("대출" + b + "번째 책: " + library[i][b]);
//			}
//		}
//		
		
		
		// 농장 수확량 계산
		// 농장의 일일 수확량을 배열에 저장했다.
		// 전체 수확량을 구하고, 평균 수확량을 구하세요.
		// 가장 많은 수확량은 얼마인지 출력 - 힌트: ㅈㄹ(정렬?)
		
		
		int[] harvest = {9, 10, 11, 8, 7, 5};
		Arrays.sort(harvest); 
		
		
		int sum = 0;
		float avg = 0;
		
		for(int i=0; i<harvest.length; i++) {
			sum = sum + harvest[i];
			avg = (float)sum/(harvest.length);
			
		}
		
		System.out.println("총 수확량: " + sum);
		System.out.println("평균 수확량: " + avg);
		System.out.println("가장 많은 수확량은: " + harvest[harvest.length-1]);
		
		
//		boolean max = true;
//		
//		for(int i=0; i<harvest.length; i++) {
//			for(int a=0; a<harvest.length; a++) {
//				if(harvest[i]>harvest[a])
//					break;
//				} 
//			} if(max) maxh = harvest[i];
//			
//		
//		}
//		
//		System.out.println(maxh);
		
		
		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
