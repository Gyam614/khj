package java0304_4;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[] {1,2,3,4};
//		
//		
//		
//		try { 
//			System.out.println( arr[6] );
//		} catch(ArrayIndexOutOfBoundsException a) {
//			System.out.println("인덱스 범위 벗어남!");
//			a.printStackTrace();
//		}
		
		try { 
		String name = null;
		
		if ( name!=null || name.equals("이순신")) {
			System.out.println("이순신이다.");
		}else {
			System.out.println("아니다.");
		}
	} catch(NullPointerException n) {
		System.out.println("이름이 NULL값이라 오류다, 청년.");
		System.out.println(n.getMessage());
	}
		

	}

}
