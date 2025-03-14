package collection7;

import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(100,"이순신");  tree.put(341,"김유신");
		tree.put(541,"장영실");  tree.put(874,"나문희");
		tree.put(241,"이순재");  tree.put(234,"박하선");
		
		System.out.println(tree);
		
		//트리맵의 검색 메서드 - 트리맵에서 검색은 key를 검색하는것!
		
		System.out.println(tree.headMap(300)); 
		System.out.println(tree.tailMap(250));
		//headMap - 해당값 '미만'의 key 모두 찾기
		//tailMap - 해당값 '초과'의 key 모두 찾기

	}

}
