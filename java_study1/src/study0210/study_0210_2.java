package study0210;

import java.util.Scanner;

public class study_0210_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//7개의 정수를 저장할 수 있는 배열을 선언
		
//	int[] seven = new int[7];
//	
//	for(int i=0; i<seven.length; i++) {
//		System.out.print("배열 입력: ");
//		seven[i] = sc.nextInt();
//	}
//	
//	for(int i=0; i<seven.length; i++) {
//		System.out.println("seven 배열 내 " + (i+1) + "번째 배열: " + seven[i]);
//	}
//	
		
		
		
		int size = 5;
		
		int[] age = new int[size]; 
		//지정된 변수를 이용해 배열의 공간(사이즈)를 지정해주는 짓은.. 웬만하면 하지 않기. | 쌤: 위험해요 :) 
		//정적 배열은 지정된 크기를 변경하기 어려움.
		//그만큼 공간을 할당받는데 배열의 크기가 확정되어 있지 않으면..
		// 컴파일 과정에서 공간을 할당받지 못함.
		// (윈도우에 의해 필요한 만큼 대여받는건데 정확한 크기가 없으면
		//  대여 안해줌..)
		age[0] = 10;
		System.out.println( age[0] );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
