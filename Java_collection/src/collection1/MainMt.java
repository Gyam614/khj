package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyAr a = new MyAr();
//		a.add(100);
//		a.add(20);
//		a.add(900);
//		a.add(7801);
//		a.add(123123);
//		
//		
//		System.out.println(a.get(11));
//		
//		
//		
//		
//		System.out.println();

		
/* 
  	자바 컬렉션 프레임워크
  	자료구조와 알고리즘을 클래스화 시켜놓은 것
  	자료구조 - 데이터를 저장 및 관리하는 방법
  	알고리즘 - 저장된 데이터를 가공하는 방법
  	
  	Collection
  	  List										Map
  	  	ArrayList(배열형 구조 리스트)					HashMap	
  	  	LinkedList									TreeMap
  	  	Vector										Properties
  	  	Stack
  	  	Queue
  	  	
  	  Set
  	  	HashSet
  	  	TreeSet
 	
 */
		
		
		
		ArrayList list = new ArrayList(); //제네릭타입을 따로 지정하지 않으면 Object클래스로 지정됨
		list.add(100);
		list.add(2313);
		list.add("장미란");
		list.add("포카칩");
		list.add(3.1444);
		
		//노오랗게 노랗게 물들었네..
		
		System.out.println(list.size()); //크기 - 데이터 몇 개 저장되어 있는지 확인
		System.out.println(list.get(2)); //인덱스위치의 데이터 출력(get메서드는 MyAr에 있음)
		System.out.println(list.indexOf("포카칩")); //배열에 특정 데이터 어디?
		
		list.remove(0); //인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩"); //삭제할 데이터 입력하여 삭제
		System.out.println(list.indexOf(2313));
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
