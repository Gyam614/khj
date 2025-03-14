package collection5;

import java.util.LinkedList;
import java.util.Queue;

public class MainQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FIFO - 구조
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(100);
		q.offer(20);
		q.offer(343);
		
		System.out.println(q);
		// 큐에서 내보내기 - 먼저 들어온 순서대로
		q.poll();
		System.out.println(q);

	}

}
