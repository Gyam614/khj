package collection6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		
		set.add("매일두유");
		set.add("내일두유");
		set.add("모레두유"); set.add("글피두유");
		set.add("어제두유"); set.add("미래두유");
		set.add("아무튼두유");
		
		//예상한 순서대로 안나옴!
		System.out.println(set);
		
		set.add("매일두유");
		System.out.println(set);
		
		// HashSet은 직접 값 한 개씩 출력 불가
		// HashSet에 저장되어있는 값 하나씩 출력하는 방법 1. ArrayList
		ArrayList<String> array = new ArrayList<>(set); //배열로 변환(ArrayList)
		
		System.out.println(array.get(2));

		//두 번째 방법
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	
		// 거래 내역 - 3달치 거래내역 가져온다.
		// 만원 이하, 5만원 이하, 10만원 이하
		// 거래내역을 데이터베이스게 가져와서 ArrayList 나 vector에 저장
		// 반복문 돌리면서 if문 사용해서 만원 이하인 경우
		// HashSet A에 저장, 5만원 이하는 HashSet B에 저장
		// Hashset C에는 10만원 이하 저장.
		
		set.remove("어제두유");
		System.out.println(set);
		
		
		
		//집합 직접 구현하기
		HashSet<String> 찬양과일 = new HashSet<>();
		찬양과일.add("바나나");  찬양과일.add("수박");
		찬양과일.add("딸기");  찬양과일.add("참외");
		찬양과일.add("키위");  찬양과일.add("메론");
		
		HashSet<String> 예나과일 = new HashSet<>();
		예나과일.add("체리");  예나과일.add("자두");
		예나과일.add("메론");  예나과일.add("무화과");
		예나과일.add("망고");  예나과일.add("바나나");
		예나과일.add("수박");  예나과일.add("오렌지");
		
		
		//교집합
		HashSet<String> 교집합 = new HashSet<>();
		Iterator<String> 과일 = 찬양과일.iterator();
		while(과일.hasNext()) {
			String fruit = 과일.next();
			if (예나과일.contains(fruit ))
			{
				교집합.add(fruit);
			};
			
			
			
		}
		
		System.out.println(교집합);
		
		
		//차집합
		//찬양과일의 차집합 구하기
		HashSet<String> 차집합 = new HashSet<>();
		과일 = 찬양과일.iterator(); //Iterator는 일회용이다.
		while(과일.hasNext()) {
			String fruit = 과일.next();
			if(!예나과일.contains(fruit) ) {
				차집합.add(fruit);
			}
		}
		System.out.println(차집합);
		
		
		// 합집합
		// 찬양과일과 예나과일의 모든 과일
		HashSet<String> 합집합 = new HashSet<>();
		과일 = 찬양과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		과일 = 예나과일.iterator();
		while(과일.hasNext()) 
			합집합.add(과일.next());
		
		System.out.println(합집합);
		
		// Set의 메서드를 이용하여 교집합,  차집합, 합집합 구하기
		System.out.println("\r\r===== Set 메서드 이용하여 교집합, 차집합, 합집합 구하기 =====");
		
		HashSet<String> 교집합2 = new HashSet<>(찬양과일);
		
		교집합2.retainAll(예나과일); //retainAll - 교집합
		System.out.println(교집합2);
		
		//차집합 구하기
		HashSet<String> 차집합2 = new HashSet<>(찬양과일); // 1. 차집합을 구할 HashSet 넣어주기
		
		차집합2.removeAll(예나과일); //2. removeAll - 차집합(교집합을 제거하는 Set의 메서드)
		System.out.println(차집합2);
		
		//합집합 구하기
		HashSet<String> 합집합2 = new HashSet<>(찬양과일); //1. 합집합을 구할 HashSet 넣어주기
		
		합집합2.addAll(예나과일); //addAll - 합집합
		System.out.println(합집합2);
		
		// 우리가 직접 만든 클래스에서는 Set 메서드(-All친구들)을 사용할 수 없음 _ 하려면 추가로 필요한 메서드가 있음. 
		
	}

}
/*	
  Set - 순차저장 안됨, 중복불가
  
  HashSet - 그룹화 목적(집합 - 교집합, 합집합, 차집합) 집합 목적!
  TreeSet - 오름차순 정렬, 검색에 특화
 
  
 */
