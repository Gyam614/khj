package test_20250120;

public class study2_20250121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("한 줄에 하나씩 출력 !@#@!$!");
		System.out.print("한 줄에 이어서 출력 ");
		System.out.print("그 다음 이어서 출력" );
		
		System.out.printf("그냥 print처럼 사용 가능");
		System.out.printf("println처럼 하려면 \n");
		System.out.printf("다음 줄에 출력 \n");
		System.out.printf("%d",100);
		//print'f'는 포맷(format)의 줄임말.)
		// \n 은 엔터키.
		//print'f'에서는 형식 지정자란에 "%%" => 퍼센티지를 두 번 넣어줘야 %가 (한 번)출력된다.
	
		
		// 형식 지정자 ( 서식문자 )
//		 * %d, %i - 10진수 정수
//		 * %f - 10진수 실수
//		 * %c - 문자
//		 * %s - 문자열
//		 * %b - boolean 타입
//		 
//		 * - 형식 지정자를 사용하기 위해 주의할 것
//		 * 1. 형식 지정자와 데이터 위치를 맞춰야 한다.
		System.out.printf("%d %f", 100, 3.14);
//       * 2. 형식 지정자와 데이터 갯수 맞추기
		System.out.printf(" %d %d %d", 10, 20, 30);
//		System.out.printf(" %d %d %d", 10, 20 ); => 오류.
		
		System.out.println(2025 + "년" + 1 + "월" + 21 + "일");
		System.out.printf("%d년 %d월 %d일 \n", 2025, 1, 21
				);
		
		float fnum = 5.12345f;
		System.out.println("println 출력: " + fnum )
		;
		
		System.out.printf("printf 출력 %.1f \n", fnum );
		// '%.'n'f => 소수점 n자릿수까지 표현.
		
		int num = 15;
		System.out.println(num);
		System.out.printf("%4d\n", num);
		// %'n'd => n자릿수 확보, 오른쪽 정렬.
		

	}

}
