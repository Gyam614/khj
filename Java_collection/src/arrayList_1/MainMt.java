package arrayList_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("김춘추"); names.add("박은희");
		names.add("최예너"); names.add("정소영");
		names.add("김현직"); names.add("서경석");
		
		System.out.println(names);
		
		//이순신 이름이 등록되지 않으면 등록하고, 이름이 있으면 등록 안하고 하려면?
		boolean hasName = names.contains("이순신");
		//System.out.println(hasName);

		if(!hasName) { names.add("이순신"); }
		
		System.out.println(names);
		
		//list -> Array(배열)
		String[]arr = names.toArray( new String [names.size()]);
		
		//Array(배열) -> list
		ArrayList<String> n = new ArrayList<>(Arrays.asList(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//ArrayList를 정렬하는 방법 - 오름차순
		System.out.println( "=== 정렬전 ( names ) === ");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(" === 정렬후 ( names ) === ");
		System.out.println(names);
		
		//내림차순
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		//최예너 -> 최예나 변경
		names.set( names.indexOf("최예너"), "최예나"); //변경할 인덱스, 변경 데이터.
		System.out.println(names);
		
		
		// 김씨 성을 가진 사람만 출력
		
		for(String name : names) {
			if(name.charAt(0)=='김') System.out.println(name);
		}
		
		names.add("박수영"); names.add("김나영");
		System.out.println(names);
		//이름에 '영'을 '진'으로 변경
		
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).contains("영")) {
				names.set(i, names.get(i).replace("영", "진"));
				
			}
		}
		
		System.out.println("\r변경 완료!: ");
		System.out.println(names);
		
		
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(100);  number.add(544);
		number.add(213); number.add(11);
		number.add(32);
		
		System.out.println(number);
		
		for(Integer num : number) {
			System.out.println(num);
		}

		
		ArrayList<Integer> bingo = new ArrayList<>();
		// 1~50 랜덤 범위에서 25개 숫자를 저장, 중복 없음.
		
		
		for (int i=0; i<25; i++) {
			int rNum = (int)(Math.random()*50+1);
				if(bingo.contains(rNum))
					i--;
				else bingo.add(rNum);
			
//				for(int c=0; c<=25; c++) {
//					if(bingo.get(i) == bingo.get(c)) {
//						i--;
//						break;
//					}
//				}
		}
		
		System.out.println(bingo);
		System.out.println(bingo.size());
		
	}

}

//데이터 저장용 클래스가 가져야할 메서드는?

