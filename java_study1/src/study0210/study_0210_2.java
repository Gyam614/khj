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
		
		
		
//		int size = 5;
//		
//		int[] age = new int[size]; 
//		//지정된 변수를 이용해 배열의 공간(사이즈)를 지정해주는 짓은.. 웬만하면 하지 않기. | 쌤: 위험해요 :) 
//		//정적 배열은 지정된 크기를 변경하기 어려움.
//		//그만큼 공간을 할당받는데 배열의 크기가 확정되어 있지 않으면..
//		// 컴파일 과정에서 공간을 할당받지 못함.
//		// (윈도우에 의해 필요한 만큼 대여받는건데 정확한 크기가 없으면
//		//  대여 안해줌..)
//		// 할거라면 int size = 5; 를 -> final int 타입(상수)로 바꾸기!
//		
//		age[0] = 10;
//		System.out.println( age[0] );
//		
		
		
		
		
		
		
		
		
//		int[] sum = new int[3];
//		int[] a = new int[] {10, 20, 30};
//		int[] b = new int[] {1, 5, 9};
//		
//		//a 배열과 b 배열의 합을 sum에 저장
//		sum[0] = a[0] + b[0];
//		sum[1] = a[1] + b[1];
//		sum[2] = a[3] + b[3];
//		
//		
//		for(int i=0; i<sum.length; i++) {
//			System.out.println(a[i] + "+" + b[i] + "=" + sum[i]);
//		};
//		
		
		
		
		
		
		//a와 b배열의 데이터를 total배열에 저장
		//a 배열의 값 먼저 저장, 이어서 b 배열의 값 저장될 수 있게
		//저장한 뒤에 total 배열 값 출력
		// 결과 -> 10 20 30 40 50 55 44 33 22 11
		
//		
//		int[] total = new int[10];
//		int[] a = new int[] {10, 20, 30, 40, 50};
//		int[] b = new int[] {55, 44, 33, 22, 11};
//		
//		for(int i=0; i<a.length; i++) {
//			total[i] = a[i];
//			total[i+5] = b[i];
//		}
//		 
//		]
//		for (int i=0; i<total.length; i++) {
//			System.out.println( total[i] );
//		}
//		
//		for(int i=0; i<a.length; i++) {
//		
//			total[i] = a[i];
//			
//			for(i=0; i<b.length; i++) {
//				total[i+5] = b[i];
//				
//			}
//			
//			
//		}
		
//		int[] a = new int[] {10, 20, 30, 40, 50};
//		System.out.println(a);
//		
//		char[] name = new char[5];
//		name[0] = 'j';
//		name[1] = 'o';
//		name[2] = 'h';
//		name[3] = 'n';
		//name -> john 문자로 저장
		//문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
		//배열이기 때문에 인덱스를 통해 문자 하나씩 입력, 저장해야한다.
		//그래서: 자바에선 문자열의 사용을 편하게 하기 위해
		// 	    String 클래스가 존재한다.
		// String 클래스에는 내부적으로 char 배열이 생성되도록 되어있다. 
		// 결론은?: 걍 String(스트링) 쓰세요..
		
//		System.out.println(name);
//		System.out.println("member");
//		
//		
//		String myName = "Fadaniel";
//		System.out.println( myName );
//		myName = "지금은 좀 바쁘단 말입니다!";
//		System.out.println( myName.charAt(7));
//		
//		String youName = new String("개미를핥을거야");
//		System.out.println( youName );
		
		// String을 절대 기본 데이터 타입이라고 생각하지 말기! -> 클래스 타입임! 
		
		
		
//		int[] a = new int[] {11, 20, 55};
//		int[] b = new int[] {13, 20, 55};
//		
//		boolean  isSame = true;
//		
//		for(int i=0; i<a.length; i++) {
//			if( a[i] != b[i] ) 
//				isSame = false;
//				
//		}
//			if (isSame) {
//				System.out.println("같은 배열");
//			} else {
//				System.out.println("다른 배열");
//			}
//		
//		
//		
//		
		
		
//		char[] name1 = new char[] {'장','냠','건'};
//		char[] name2 = new char[] {'장','동','건'};
//		
//		//name1 과 name2의 이름이 같은 이름인가?
//		
//		boolean sameName = true;
//		
//		for(int i=0; i<name1.length; i++) {
//			if (name1[i] != name2[i])
//				sameName = false; //조회하며 한 번이라도 참이 나오면 false로 변환 -> 첫 for문 외부로 그대로 출력.
//		}
//			if(sameName) {
//				System.out.println("같은 이름");
//		} else {
//			System.out.println("다른 이름");
//		}
//		
		
		
		String name1 = "주동건";
		String name2 = "이동건";
		
		if(name1.equals(name2))
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		
		
		System.out.println( name1.compareTo(name2));
		//compareTo: 0이라면 두 문자열은 동일 | 양수: 사전적 순서가 앞일 경우 | 음수: 사전적 순서가 뒤인 경우
	}

}
