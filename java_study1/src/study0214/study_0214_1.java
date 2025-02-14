package study0214;

import java.util.Scanner;

public class study_0214_1 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		String str = "member"; //String은 클래스 타입_인덱스 방식으로 사용하면 안된다. 
//		char[] c = new char[] {'a'};
//		
//		
//		String[] names = new String[5];
//		names[0] = new String("박문수");
//		names[1] = "김정호";
//		names[2] = "서경림";
//		names[3] = "김명준";
//		names[4] = "이정훈";
//		
////		for (int i=0; i<names.length; i++) {
////			System.out.println(names[i]);
////		}
//		
//		for(String name : names) { //for문 조건식 내에서 배열조회에 사용할 임의변수 지정 (i랑 거의 같은 원리임)
//			System.out.println(name);
//		}
//		
//		String temp = String.join(",", names);
//		
//		boolean hasName = temp.contains("서경림");
//		
//		if( hasName ) System.out.println("이름 등록됨");
//		else System.out.println("등록되지 않은 이름");
		
//		System.out.println( str.charAt(0) );
				
		//참조변수 : 특정 공간의 메모리주소만 저장할 수 있는 변수
		//참조변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수로 나뉜다.
		//			배열의 주소를 가지고 있는 참조변수는 참조변수이름[인덱스] 방식으로 사용
		//			객체의 주소를 가지는 참조변수는 참조변수이름.xxxx 방식으로 사용
		//int a = 10;
		
		
		
		
		
		// 1. 학과 테이블 데이터 입력
		
//		String[][] dept = new String[4][7];
//		dept[0] = new String[] {"컴퓨터공학과", "정보과학과", "정보통신공학과", "정보산업공학과", "전자공학과", "문헌정보학과", "전기공학과"};
		// - 2차원 배열 할당량을 모두 정한 상태에서 'new String' 선언으로 데이터 입력을 하면:
		//	 dept 배열 안에 만들어놓은 [7]배열이 아닌 또다른 새 배열에 데이터가 들어간다. (중복, 공간낭비)
		
		
//		String[][] dept = new String[4][];
//		dept[0] = new String[] {"컴퓨터공학과", "정보과학과", "정보통신공학과", "정보산업공학과", "전자공학과", "문헌정보학과", "전기공학과"};
//		dept[1] = new String[] {"이지은", "김영미", "박순애", "이미선", "이춘애", "김기범", "박준용"};
//		dept[2] = new String[] {"3333", "3334", "3335","3336", "3337", "3338", "3339"};
//		dept[3] = new String[] {"T101", "T201", "T301", "T401", "T501", "T601", "T701"};
//		
//		System.out.print("검색: ");
//		String search = scan.nextLine();
//		int idx= -1;
//		
//		
////		String search = "정보통신공학과";
//		//정보통신학과의 과사무실 위치와 조교 이름은? 
//		for(int i=0; i<dept[0].length; i++) {
//			
//			if ( dept[0][i].equals(search) ) {
//				
//				idx = i;
//				break;
//				
//			} 
//			
//		} 
//		
//		if(idx == -1)
//			{ System.out.println("결과를 찾을 수 없습니다.");
//		return; //return은 메서드 종료. / main메서드 종료되면 프로그램 끝. 
//			}
//			
//		System.out.println("조교: " + dept[1][idx] + ", 사무실: " + dept[3][idx]);
		
		
		
		//문제 1.
		//학생 5명의 시험 성적을 키보드를 통해 입력. 평균 점수 출력.
		//반드시 시험 성적은 배열에 저장!
		
//		int[][] score = new int[2][];
//		int sum = 0;
//		
//		score[0] = new int[] {101, 102, 103, 104, 105};
//		score[1] = new int[] {0,0,0,0,0};
//		
//		for(int i=0; i<score[0].length; i++) {
//			System.out.print("'" + score[0][i] + "' 번 학생의 점수를 입력해주세요: ");
//			score[1][i] = scan.nextInt(); };
//		
//		
//		
//		for(int i=0; i<score[0].length; i++) {
//			System.out.println("학번: " + score[0][i] + " | 성적: " + score[1][i]);	
//			
//			sum = sum + score[1][i];
//		};
//		
//		System.out.println("----------------------------\r");
//		
//		double avg = sum / score[0].length;
//		System.out.println("학생 평균 점수: " + avg);
	
		
		
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};

		
		//문제 2.
		//알파벳 문자 하나 입력.
		// 입력한 알파벳으로 시작하는 단어 모두 찾아 출력
		// 출력한 단어가 몇 개인지 출력.
		
		System.out.print("알파벳 검색: ");
		char alpa = scan.nextLine().toLowerCase().charAt(0);
		
		int sum = 0;
		
		
		for( String str : word ) {
			
			if(str.charAt(0) == alpa) {
				System.out.println(" " + str);
				sum++;
			}
		}
		System.out.println("\r-------------------");
		System.out.println("결과 수: " + sum + "건");
		
		// 너무 어렵게 생각하지 말아봐..
		// 그럴수록 더 어려워지잖아..
		
		
		
		
		
		// 문제3. 
		/* 
		 	영화관 예약 사이트를 만들려고 한다.
		 	영화관 관별로 좌석 수가 다르다.
		 	3관의 좌석 수는 96개(8줄 12열).
		 	
		 	좌석에 예약 완료된 곳은 1로 표시
		 	비어있는 좌석은 0으로 표시
		 	
		 	몇 명 예약할 것인지 인원수를 입력하면
		 	연속적으로 비어 있는 자리로 지정해준다.
		 	몇 번째 좌석이 예약이 되었는지 출력.
		 		 
		 */
		
		
		
		int[][] seat = new int[8][];
		int count = 0;
		
		seat[0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[1] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[2] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[3] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[4] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[5] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[6] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		seat[7] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
