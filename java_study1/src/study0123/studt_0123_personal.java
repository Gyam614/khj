package study0123;

import java.util.Scanner;

public class studt_0123_personal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		 int number;
		 System.out.print("숫자는?: ");
		number = scan.nextInt();
		
		String scale = (number < 20) ? "나중에 다시 봅시다." : "어서오십시오.";
		System.out.println(scale);
		 
		

	}

}
