package study0213;

import java.util.Scanner;

public class study_0213_1 {

	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String title = "자바는 즐거워";
		
//		System.out.print("제목 입력: ");
//		title = scan.next(); // .nextLine();
		
		System.out.println(title);
		
		
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		

		System.out.println(age + " " + name);
		
		
		//키보드로 임력하면 버퍼에 쌓인다.
		//next()는 엔터 이전의 버퍼에 쌓여있는 값을 가져온다.
		//nextLine()은 버퍼에 엔터가 있어야 버퍼의 값을 가져온다.
		
		//파일 불러오기 (읽기)하면 버퍼의 영향을 받을 수도 있다. 
		
		
		
		
		
		
		
		
		
		
	}

}
