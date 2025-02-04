package study0204;

import java.util.Scanner;

public class study_0204_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);


//반복문 - for, while, do~while
//조건이 충족되었을 때 반복적으로 코드를 실행시키는 언어
//반복 - 몇 번을 반복할거냐, or 몇 번을 반복할 것인지 정하지 않고 하는 경우와 반복횟수를 정하여 반복하는 경우
//주로 반복횟수가 정해진 경우는 for문
//반복횟수가 정해져 있지 않은 경우는 while문 


//System.out.print("숫자 입력: ");
//int num = scan.nextInt();
//
// for(int i=1; i<=num; i++) {
//	 System.out.println("[일단 춤] ዽ ጿ ኈ ቼ ዽ ጿ ኈ ቼ ዽ ጿ ኈ ቼ ዽ [추시오] ");
// } 
// 
// for (int i=num; i>=1; i--) {
//	 System.out.println("(ง •̀_•́)ง (ง •̀_•́)-•퍽" );
// }


 //for(초기값 지정; 조건식;) { 
// 	(조건식이 참일경우) 실행코드 }
 // 초기값 확인 -> 조건식 비교 -> (조건이 참일 경우) 코드 실행 -> 증강식 동작 -> 조건식 비교
// 	(조건식이 거짓이 될 때까지 계속 반복)
 // 위 예시에 사용된 변수i는 출력이 아닌 반복을 위한 변수.
		
		
		
// 6번 반복하는 반복문을 만들고 싶다.
//1부터 시작해서 6까지
//i=1; ->1부터 시작하겠다.
//i<=6; ->6까지 표현.
// i++ 또는 i=i+1 (1씩 증가)
//for(int i=1; i<=6; i++)


// 정수 5부터 17까지 출력하는 반복문 만들기

//for (int i=5; i<=17; i++) {
//	System.out.println(i);
//	if(i==17) {
//		System.out.println("[일단 춤] ዽ ጿ ኈ ቼ ዽ ጿ ኈ ቼ ዽ ጿ ኈ ቼ ዽ [추시오] ");}
//	}

//총합 구하기 (배고프다)
//int sum=0;
//
//for(int num=1; num<=20; num++) {
//	sum = sum + num;
//}
//System.out.println("1부터 20까지의 합: "+ sum);
		
// num(초기값) -> num<=10(조건문) -> {sum=sum+num}(코드실행) -> sum -> num++(증감식 동작) 
// -> 조건식 확인, 코드 실행 반복...

//두 개의 정수를 입력하여  두 수 중 작은 숫자부터 큰 숫자까지의 합을 구하세요.
// 예) 1번째 숫자를 21, 2번째 숫자를 4 입력했다면
// 		4부터 21까지의 합 구하기

//
//System.out.print("첫 번째 정수: ");
//int num1 = scan.nextInt();
//
//System.out.print("두 번째 정수: ");
//int num2 = scan.nextInt();
//
//
//int sum = 0;
//
//if (num1 > num2) {
//	for(int i=num2; i<=num1; i++) {
//		sum = sum + i;
//	} System.out.println(num2+"부터 "+num1+"까지의 총합: " + sum);
//} else if (num1 < num2 ) {
//		for(int i=num1; i<=num2; i++) {
//			sum = sum + i; } 
//		System.out.println(num1+"부터 "+num2+"까지의 총합: "+sum);
//	} else {
//		System.out.println("두 정수가 같은 값입니다.");
//	}
//


		
//	for (int i=1; i<=9; i++) {
//		System.out.printf("2*%d= %d \n", i, (2*i));
//	}
		
//		
//	System.out.println("2*1=" + (2*1));
//	System.out.println("2*2=" + (2*2));
//	System.out.println("2*3=" + (2*3));
//	System.out.println("2*4=" + (2*4));
//		
		
		
System.out.println("숫자 입력: "); 
int num = scan.nextInt();
 

for (int i=1; i<=9; i++) {
	System.out.printf("%d * %d = %d \n", num, i, (num*i));
}
		
		
		
		
		
		
		
		
		
	}

}


