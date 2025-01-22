package test_20250120;

import java.util.Scanner;

public class study_20250121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		//만 나이 입력
		int age = 0;
		System.out.println("나이는?: ");
		age = a.nextInt();
		//변수 = Scanner변수.nextInt(); => 입력할 값이 변수가 되도록.
		
		//태어난 년도
		int birth = 2025 - age;
		System.out.println("나이: " + age + "살");
		System.out.println("태어난 년도는?: " + birth + "년");
		birth = a.nextInt();
	}

}
