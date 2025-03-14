package Control;

import java.util.Scanner;
import Service.AccountService;

public class MainMt {

	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		
		System.out.println("\n\n ========== 메뉴 ==========");
		System.out.println("0. 계좌생성");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액조회");
		System.out.println("4. 종료");
		System.out.print("선택: ");
		int num = sc.nextInt();
		return num;
		
		
	} 
	
	public static void main(String[] args) {

		
		//메뉴
		while(true) {
			switch(menu()) {
			case 0: //계좌생성 선택
				AccountService.createAccount();
				break;
			
			case 1: //입금 선택
				AccountService.deposit();
				break;
			case 2: //출금 선택
				AccountService.withdraw();
				break;
			case 3: //잔액조회 선택
				AccountService.search();
				break;
			case 4: //종료 선택
				return;
			default:
				System.out.println("\r잘못된 선택입니다.");
			} 
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
