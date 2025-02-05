package study0205;

import java.util.Scanner;

public class study_0205_1 {
// 자바의 변수 종류
// 지역 변수, 클래스 변수(static), 인스턴스 변수
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//for(int i=1; i<=2; i++) {
//	System.out.println(i + "번 왕호박: 디스 이즈!");
//	for(int k=1; k<=3; k++) {
//		System.out.println(k + "번 호박: 할로윈!!🎃🎃" );
//	} System.out.println("\r");
//}
//		
		
		
int i=1;
for(int k=2; k<=9;) {
	System.out.println( k + "X" + i + "는: " + (k*i));
	i++;
	if (i==10) {
		k++;
		i=1;
		System.out.println("-------------------------");
	}
}

//for(int i=2; i<=9; i++) {
//	System.out.println("구구단 " + i + "단");
//	for(int k=1; k<=9; k++) {
//		System.out.println(i + "X" + k + "는: " + (i*k));
//	}System.out.println("\r");
//}
//		
		
		
		

		
		
		
//		
//		int num=0;
//		
//		for( ; num!=100; ) {
//			System.out.println("정수 입력: ");
//			num = scan.nextInt();
//		}
//		
//		
//		for문의 무한 루프
//		1)for(;;), for(;true;)
//		for(; true ;) { 
//			System.out.print("정수 입력: ");
//			int num = scan.nextInt();
//			if(num == 0) break;
//			// 무한 루프의 종료 시점 정하기: if문과 break로! 
//		}
//		// break는 해당 제어문(반복문, switch문)을 종료시키기만 한다.
//		// return은 메서드(method)를 종료
//		
//		System.out.println("무한루프 종료.");
		
//		2)
//		for(int i=1; ; i++) {
//			System.out.println(i);
//		}
		
		
// for문으로는.. 무한 반복문을 잘 만들지 않음.
while(true) {
	
}

		
		
		
		
//		for(int i=1; i<=10; i++) {
//			System.out.println("난 슬플 때 춤을 춰");
//		}
	// for(초기값; 조건식; 증감식) {
	// 반복내용 }
	// 초기값 -> 조건식 비교 -> 참이라면 -> {내용} -> 증감식
	// -> 조건식 비교 -> 참이라면 -> {내용} -> 증감식
	// -> 조건식 비교 -> 거짓이라면 -> 종료
		
		
		
	// 10부터 100까지의 총합을 구하세요.
	// 단, 10 단위의 숫자만 계산(10,20,30,40,50 ... 100)
		
//	int sum = 0;
//	
//	for(int i=10; i<=100; i=i+10) {
//		System.out.println(i);
//		sum = sum + i;
//	} System.out.println("총합은: " + sum);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
