package Control;

import java.util.HashMap;
import java.util.Scanner;

import Service.ActiveService;
import Service.MemberService;
import Service.SchoolService;


public class MyMain {
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		
		System.out.println("\n\n ========== 메뉴 ==========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택: ");
		int num = sc.nextInt();
		return num;
		
	
	}
	
	public static int subMenu(SchoolService schoolService, String id) {
		System.out.println("\n ===== 아이러브스쿨 =====\n");
		System.out.println("1. 학교찾기");
		System.out.println("2. 동창회");
		System.out.println("3. 소모임");
		System.out.print("선택: ");
		int num = sc.nextInt();
		
		if(num==1) {
			schoolService.searchSchool(id);
			
		}else if(num==2) {
			schoolService.myReunion();
			
		}else if(num==3) {
			schoolService.smallGather();
			
		} else {
			return 0;
		} 
		return subMenu(schoolService, id);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서비스 클래스들을 통해 로그인과 학교 찾기를 할 것이다.
		MemberService memberService = new MemberService();
		SchoolService schoolService = new SchoolService();
		
		//메뉴
		while(true) {
			switch(menu()) {
			case 1: //로그인 선택
				String id = memberService.signIn();
				if ( id != null) //로그인 성공
					{ subMenu(schoolService, id);
					return; }
				else //로그인 실패
					System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
				break;
			case 2: //회원가입 선택
				memberService.signUp();
				break;
			case 3: //종료 선택
				return;
			default:
				System.out.println("\r잘못 선택하셨어요.");
			} 
		}

	}

}
