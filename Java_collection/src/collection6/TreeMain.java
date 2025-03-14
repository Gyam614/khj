package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35);   tree.add(41);   tree.add(29);
		tree.add(9);   tree.add(15);   tree.add(20);
		tree.add(56);   tree.add(49);   tree.add(11);
		tree.add(17);   tree.add(89);   tree.add(39);
		
		
		System.out.println(tree); //기본 오름차순 정렬!
		
		
		System.out.println(tree.headSet(20)); //해당 값보다 미만인 작은 값만 찾아주는 것 : headSet
		System.out.println(tree.tailSet(31)); //해당 값보다 큰 값만 찾아주는 것 : tailSet
		
		System.out.println(tree.first()); // 첫번째 값
		System.out.println(tree.last()); //마지막 값
		
		System.out.println(tree.higher(29));
		//higher - 해당값 '초과'의 값 중 가까운 것 찾기
		//가장 가까운 값이 없으면 null
		
		System.out.println(tree.lower(30));
		//lower - 해당값 '미만'의 값 중 가까운 것 찾기
		
		System.out.println(tree.ceiling(37));
		//ceiling -  해당값 '이상'의 값 중 가까운 것 찾기
		//			해당값 포함해서 찾기 때문에 입력한 값이 나올 수도 있다.
		
		System.out.println(tree.floor(17));
		// floor - 해당값 '이하'의 값 중 가장 가까운 것 찾기
		//		  해당값 포함해서 찾기 때문에 입력한 값이 나올 수도 있다.
		
		System.out.println(tree.subSet(17, 41));
		//subSet - 범위 지정하여 검색
		//		subSet(a,b) : a부터 b 전까지 검색
	}

}
