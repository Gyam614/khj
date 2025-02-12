package study0212;

import java.util.Scanner;

public class study_0212_1 {

	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		//2차원 배열 : 같은 타입의 1차원 배열이 여러 개로 이루어진 구조
		
		int[] a = new int[] {3,4,5}; //1차원 배열 - 3의 크기
		int[] b = new int[] {1, 20, 60}; //1차원 배열 - 3의 크기
		int[] c = new int[] {23, 98, 54}; //1차원 배열 - 3의 크기
		
		//A반 학생의 성적 -> 1차원 배열 
		//1학년 전체 학생성적 -> 2차원 배열
		
		
		//2차원 배열
		int[][] abc = new int[2][3];
		//앞쪽 [n]: 1차원 배열이 n개 | 뒤쪽 [n]: 1차원 배열의 메모리
		//ex) [2][3]: 3칸짜리 1차원 배열이 2개

		int[][] test = new int[][] {{1, 2, 3}, {4, 5}};
		// = [2][2] | 칸에 숫자를 입력하지 않고 데이터를 직접 입력할 수 있음._중괄호로 각 배열을 꼭 묶어줘야한다.
		int[][] ttest = new int[][] {a,b,c};
//		System.out.println(test[0][0]); //출력값: 1 (2차원배열 test 의 0index째 배열의 0index번째 데이터값)
										// 		2차원 배열 값을 출력할 때엔 대괄호 안에 데이터 입력
		
		
		
		int[][] arr = new int[3][4];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 50;
		arr[1][3] = 100;
		arr[2][1] = 10;
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("=== index: " + i + "번째 ===");
			
			for(int ii=0; ii<arr[i].length; ii++) {
				System.out.print("데이터 값을 입력해주세요: ");
				int num = sc.nextInt();
				
				arr[i][ii] = num;
				
				if(i==arr.length) 
					System.out.println(arr[i][ii]);
					 
			} 
		} 
		

		
		
		//2차원 배열값 출력법 혼자 알아보기: 
//		for(int i=0; i<test.length; i++) {
//			
//			for(int ii=0; ii<test[i].length; ii++) {
//				
//				System.out.println(test[i][ii]);
//			}
//		}
//		
		
//		이 방식은 index 표현이 어렵다.
//		for(int[] tmp : arr) {
//			for (int num : tmp) {
//				
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
