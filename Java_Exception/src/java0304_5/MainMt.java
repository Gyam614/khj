package java0304_5;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,40,50,20};
		
		try {
		System.out.println( arr[5] ); }
		catch(Exception arrE) {
			System.out.println("배열 오류야!");
		};
		
		String str = "123ab";
		try {
		int num = Integer.parseInt(str); //Integer.parseInt는 문자열->정수변환 
		System.out.println("정수: " + num); }
		catch(Exception numE) {
			System.out.println("parseInt 오류야!!");
		};
		
		String word = "good Bye!";
		System.out.println(word.substring(word.indexOf("g")));
		
		try {
		System.out.println(word.substring(word.indexOf("m"))); }
		catch(Exception wordE) {
			System.out.println("문자 오류야!!!");
		}
		
		
		
		
		
		

	}

}
