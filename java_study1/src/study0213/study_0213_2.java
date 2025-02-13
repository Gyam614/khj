package study0213;

import java.util.Scanner;

public class study_0213_2 {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		String word = "I like Pasta";
		//문자열에서 특정 문자 추출
		
		System.out.println(word.charAt(7));
		System.out.println(word.substring(0));
		
		String like = word.substring(2,6);
		System.out.println(like);
		
		
		
		
		//문자열의 길이(전체 문자가 몇 개인가?)
		System.out.println(word.length());
		
		System.out.println("\r======== 문자열 길이 구하기 ========\r");
		
		String text = "나랏말싸미 듕귁에 달아 문자와로 서르 사맛디 아니할세";
		
		//문자열에서 특정 문자 또는 문자열 인덱스 구하기
		int idx = text.indexOf('문');
		System.out.println(idx);
		
		idx = text.indexOf("문자와로");
		System.out.println(idx);
		
		//문자와로 부터 출력
		
		System.out.println(text.substring(13));
		
		//indexOf() 메서드는 문자열에서 특정 문자나 문자열의 인덱스를 알려줌.
		//만약 문자열에 없는 값이라면 -1이 출력됨.
		
		idx = text.indexOf("백성이");
		System.out.println(idx);
		
		
		
		
		// indexOf() 메서드를 통해 문자열에 특정 문자나 문자열이 포함되어
		// 있는지 알 수 있다.
		// 포함 여부 알 수 있는 메서드 !! 하나 더!!
		
		System.out.println(text.contains("듕귁에")); //true||false 로 출력.(약간 서치_검색 같은 느낌)
		
		//문자열 비교 - equals() 문자열A.equals(문자열B);
		//결과는 true||false 
		
		
		//문자열 분할
		text = "서경림-김현진-김미란-김석진-주동건-정수영";
		System.out.println(text.split("-")[1]); // split : 문자열을 배열로 바꿔주는 것.
		//"-"(하이푼)으로 문자열을 split(분리)하여 배열로 만드는 원리.
		
		
		
		String[] names = text.split("-");
		System.out.println(names[4]);
		
		
		//배열 -> 문자열로 변환
		text = String.join(",", names); // names[0] + "," + names[1]
		System.out.println(text);
		
		
		
		// 대문자, 소문자
		System.out.println(word);
		System.out.println("대문자 변환: " + word.toUpperCase()); //대문자
		System.out.println("소문자 변환: " + word.toLowerCase()); //소문자
		
		
		//문자열 합치기 "abc" + "zxc" -> abczxc
		System.out.println("abc" + word);
		
		// String 클래스 타입의 변수가 비었냐? (문자열이 저장되어있냐?)
		
		System.out.println(word.isEmpty());
		System.out.println(word.isBlank()); 
		//비어있냐!
		//word는 파스타를 사랑한다는 말이 적혀있기 때문에 두 개 모두 false
		
		//두 친구의 차이는: 
		word = " ";
		System.out.println(word.isEmpty()); //띄어쓰기를 포함하며 계산
		System.out.println(word.isBlank()); //띄어쓰기를 제외하고 글자만 계산
		// empty는 문자열의 인덱스가 존재하지 않아야 true
		// blank는 띄어쓰기와 같이 빈공간인 경우에 비어있다 - true로 표시 
		System.out.println(word.length()); //이 결과값이 1이라도 나온다면 isEmpty는 false로 출력.
		
		
//		word = null; // null이 저장되어 있는 경우에는 문자열 관련 메서드 사용 불가!! | 비어있다 가 아니라 그냥 아예 없는 것!
//		System.out.println(word.isEmpty());
//		System.out.println(word.isBlank()); // 이거 두 개 지금 출력하면 에러남
		
		
		
		// 문자열 바꾸기 - 치환
		
		word = "김현진은 너구리를 좋아한다.";
		
		System.out.println(word.replace("너구리", "고양이")); //일시적인 것
		System.out.println(word);
		
		text = word.replace("너구리를 좋아한","오타쿠");
		System.out.println(text);
		
		word = "010.1234.5678.9128";
		System.out.println(word.replaceAll("[0-4]", "a"));
		
		
		/* 정규 표현식
		 
		  .   임의의 문자 1개를 의미.
		  ^   시작을 의미 (^a : a로 시작하는 단어)
		  $   $앞쪽에 문자열로 문자가 끝나는지를 의미 (a$ : a로 끝나는 단어)
		  []  []괄호 안의 문자가 있는지 확인해라 뜻 ([a]: a문자가 있는지 확인)
		  		[^] []괄호 안에 ^뒤의 문자가 있으면 제외해라
		  		[a-z] : a부터 z까지 문자 확인
		  		[^a-z] : a부터 z까지를 제외한 문자
		  -    사이의 문자 또는 숫자를 의미 ([a-z] : a부터 z까지 문자 확인) 
		   		[a-z0-9] : 알파벳 소문자 전체, 0~9 중 한 문자
		  |	   또는(or) [a|h]
		  ()   그룹     01(0|1) : 01 뒤에 0 또는 1
		  {}   개수     a{3}b : a가 3번 나오고 뒤에 b가 있다
		  		^\d{3}-\d{4}-\d{4}$ : 전화번호 정규표현식 (010-1234-5678)
		  \d   0~9 숫자
		  \b   공백, 탭, /를 의미
		  \B   \b의 부정 (공백, 탭 등이 아닌 문자)
		  \D   0~9가 아닌 것
		  \w   알파벳 대소문자+숫자+"_" [a-zA-Z_0-9]
		  
		  
		 
		 */
		
		
		word = "tomato98731*";

		System.out.println( word.replaceAll("[^a-z]", "0"));
		//알파벳소문자를 지외한 나머지를 0으로 변경
		
		//비밀번호 6자리 이상 12자리 이하 영허 소문자, 숫자 포함
		// ^[a-z0-9]$
		
		//주민등록번호 확인
		// \d{6}-[1-4]\d{6}
		

	}

}
