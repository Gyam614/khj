package study0123;

public class study_0123_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//비트 논리 연산자
		System.out.println(27 & 13); // 결과: 9 | and 연산: 두 숫자 모두 1일 경우에만 1처리
		System.out.println(27 | 13); // 결과: 31 | or 연산: 상관없이 1처리
		System.out.println(27 ^ 13); // 결과 : 22 | xor 연산: 서로 1과 0이 다른 값만 1처리
		System.out.println(~13); // 결과: -14 | not 연산: 부호비트가 바뀌는 연산.
									// 컴퓨터에 프로그래밍된 숫자 시스템은 0을 양수에 넣었기 때문에, 값이 예상보다 1 차이가 난다.
	
	
		//비트 쉬프트 연산자
		System.out.println(21 << 4); // <<: 시프트 연산자: 부호비트(1,0)을 설정한 방향으로 n만큼 이동

		
	
	}

}
