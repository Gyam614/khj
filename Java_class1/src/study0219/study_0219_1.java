package study0219;

import java.util.Scanner;

public class study_0219_1 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Food f1 = new Food("돈가스", 8000);
		//기본 생성자 메서드가 존재하기에 Food()가 실행됨.
		
		System.out.println(f1.foodName);
		
		Food f2 = new Food();
		
		
		Mart pro1 = new Mart("배꼽 베이글", "Nuldam", 1);
		
		System.out.println("이름: " + pro1.name + " | 브랜드: " + pro1.brand + " | 수량: " + pro1.quan);
		
		
		
		
		
		
	}

}
