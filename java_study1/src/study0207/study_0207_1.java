package study0207;

import java.util.Scanner;

public class study_0207_1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 문제4
		    *
		    **
		    ***
		    별을 위와 같이 출력하세요
		    힌트> 첫번째 줄이라서 별 한 개 두 번째 줄이라서 별 두 개
		         세 번째 줄이라서 별 세 개 (이중 for문)
		 
		 
		 문제5
		 0 1 2 3
		 4 5 6 7
		 8 9 10 11
		 숫자를 위와 같이 출력하세요
		 
		 
		  문제6 - 비밀번호 찾기
		  	1. 비밀번호는 4자리로 구성되어있다. 1~9 중 하나이다. 중복XX
		  	2. 첫 번째 숫자는 네 번째 숫자보다 2만큼 크다.
		  	3. 두 번째 숫자는 세 번째 숫자보다 작다.
		  	4. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면
		  		16566이다. | 예) 1234 + 4321
		 
		 */
		
		//4.
		int row=0;
//
//		
//
//		
		System.out.print("몇 줄을 나열시킬까요?: ");
		row=sc.nextInt();
		
		
		//선을 계산으로 입력
		for(int line=1; line<=row; line++) {
			for(int star=1; star<=line; star++) //선마다 별 늘리기
			{ 
				System.out.print("*");
			}
			System.out.println();
				}
//			//혼자 못풀었음
//		 	//원리는 알고 어케 최선을 다하기는 함
//			//열받아죽겠음
//			
//	
//		
		System.out.print("숫자 몇 줄을 나열시킬까요?: ");
		row=sc.nextInt();
		
		int number=0;
		//5.
		for(int nline=1; nline<=row; nline++) {
			for(int num=0; num<4; num++) 
			{
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
	 //4번과 거의 같은 원리
		
		
		System.out.println("========================================================" + "\r");
		
		//6. 
		
		
		
		

////		
//		while(true) {
//			
//			
//			int a = (int)(Math.random()*9+1);
//			int b = (int)(Math.random()*9+1);
//			int c = (int)(Math.random()*9+1);
//			int d = (int)(Math.random()*9+1);
//			
//			int pwd = ((a*1000)+(b*100)+(c*10)+d);
//			int rev_pwd = ((d*1000)+(c*100)+(b*10)+a);
//			
//			
//			System.out.println("비밀번호: " + pwd);
//			System.out.println("역순_비밀번호: " + rev_pwd);
//			System.out.println("=======================================" + "\r" ); 
//			
//			if((pwd+rev_pwd)==16566) break; 
//		}

		
		System.out.println("==== 6.비밀번호 찾기. ====");
//		
		for (int a=1; a<=9; a++) {
			for (int b=1; b<=9; b++) {
				
				for (int c=1; c<=9; c++) {
					
					for (int d=1; d<=9; d++) {
						
						if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
							if(a==(d+2) && (b<c)) {
								int pwd = (a*1000)+(b
										*100) + (c*10) + d;
								int dwp = (d*1000) + (c*100) + (b*10) + a;
								
								if((pwd+dwp)==16566) {
								
									System.out.println("비밀번호는: " + pwd);
									break;
								}
							}
						}
							
							};
						
						
						
					}
				}
			}
			
	
		
		
		//4자리
		

		
//		System.out.print(" " + pwd1 + " " + pwd2 + " " + pwd3 + " " + pwd4 + " ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
