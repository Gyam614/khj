package collection1;

public class MyAr {
	
	int[] arr;
	
	//정수추가 메서드
	public void add(int num) {
		if(arr==null) {
			arr = new int[1];
		
		} else {
			int[] temp = new int[arr.length+1];
			for(int i=0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		
		arr[arr.length-1] = num;
	}
	
	public int get(int index) {
		if (arr.length-1 < index)
			throw new RuntimeException("인덱스 범위 초과");
		return arr[index];
	}
	
	//인덱스 지정하여 정수 출력 메서드

}
