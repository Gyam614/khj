package Service;

import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;


public class AccountService extends Account {
	
	private static ArrayList<Account> account = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	
	public static void createAccount() {
		System.out.println("\n --- 계좌생성 --- ");
		System.out.print("계좌번호(ID)입력: ");
		String aId = scan.next();
		System.out.print("초기입금액 입력: ");
		int money = scan.nextInt();
		
		Account newAccount = new Account(aId, money);
		newAccount.setAccountId(aId);
		newAccount.setMoney(money);
		
		account.add(newAccount);
		
		System.out.println("회원가입 성공!");
		
		
	};
	
	public static void deposit() {
		System.out.println("\n --- 입금 --- ");
		System.out.print("입금할 계좌ID: ");
		String aId = scan.next();
		
		for(Account account : account) {
		if (account.getAccountId().equals(aId))
		{ System.out.print("입금액: ");
		int depositMoney = scan.nextInt();
		account.setMoney(account.getMoney() + depositMoney); 
		System.out.println("입금 완료!");
		return; }
		
		} 
		System.out.println("계좌 번호를 잘못 입력하셨습니다.");
		
	}
	
	public static void withdraw() {
		System.out.println("\n --- 출금 --- ");
		System.out.print("출금할 계좌ID: ");
		String aId = scan.next();
		
		for(Account account : account) {
			if (account.getAccountId().equals(aId))
		{ System.out.print("출금액: ");		int withdrawMoney = scan.nextInt();
		account.setMoney(account.getMoney() - withdrawMoney);
		System.out.println("출금 완료!");
		return; }	
			
		} 
		System.out.println("계좌 번호를 잘못 입력하셨습니다.");
	}

	
	
	public static void search() {
		// TODO Auto-generated method stub
		System.out.println(account);
		
	}
	
}
