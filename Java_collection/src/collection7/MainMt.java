package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("수박", 15000);   map.put("바나나", 5400);
		map.put("앵두", 2300);   map.put("딸기", 12400);
		
		System.out.println(map);
		
		
		map.put("수박", 19000);
		System.out.println(map);
		
		if(map.containsKey("수박")) {
			System.out.println("key로 수박이 사용중");
		}
		// 포함 여부는 contains인데, key, value 각각 있다.
		
		System.out.println(map.keySet()); //key만 뽑아내기.
		System.out.println(map.values()); //value만 뽑아내기.
		
		System.out.println(map.get("수박")); //get("key") 조회 >> 입력된 key의 value값이 출력됨. (없는key를 입력하면 null값출력)

		//맵에 저장되어있는 특정 key의 value 변경
		map.put("앵두", 3100);
		System.out.println(map);
		
		
		map.replace("앵두", 4300);
		System.out.println(map);
		//put 메서드는 새로운 값 저장 또는 변경
		
		map.replace("구아바", 9800);
		System.out.println(map);
		//replace는 새로운 값 저장은 불가능.
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
			
		}
		
		
		HashMap<String, Active> cmd = new HashMap<>();
		cmd.put("회원가입", new Member());
		cmd.put("게시판", new Board());
		cmd.put("게임", new Game());
		
		cmd.get("게시판").save();
		cmd.get("회원가입").save();
		cmd.get("게임").save();
		
		String command = "게시판";
		
		Active action = cmd.get(command);
		action.save();
		
		
	}
}
/* 
 	Map - key와 value로 이루어진 구조
 		key는 중복 불가, value는 중복 가능
 		조회방법은 key를 통해 value 찾기
 	
 		HashMap, TreeMap
 	
 */
