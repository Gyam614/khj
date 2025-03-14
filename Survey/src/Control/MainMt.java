package Control;

import java.util.Scanner;

import DAO.SurveyDAO;
import Service.AnswerService;
import Service.SurveyService;

public class MainMt {

private static Scanner sc = new Scanner(System.in);
private static int menu() {
		
		System.out.println("\n\n ========== 설문조사 ==========");
		System.out.println("1. 설문조사 시작");
		System.out.println("2. 설문조사 통계 조회");
		System.out.println("3. 설문조사 결과 정렬(나이순)"); 
		System.out.println("4. 설문조사 결과 정렬(최근순)");
		System.out.println("5. 종료");
		System.out.print("선택: ");
		int num = sc.nextInt();
		return num;
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnswerService answerservice = new AnswerService();
		SurveyService surveyservice = new SurveyService();
		
		//메뉴
		while(true) {
			switch(menu()) {
			case 1: //설문조사 시작 선택
				surveyservice.seolmun();
				break;
			case 2: //설문조사 통계 조회 선택
				answerservice.showStat();
				break;
			case 3: //설문조사 결과 정렬(나이순) 선택
				answerservice.showByAge();
				break;
			case 4: //설문조사 결과 정렬(최근순) 선택
				answerservice.showByDate();
				break;
			case 5: //종료 선택
				return;
			default:
				System.out.println("\r번호가 잘못되었습니다.");
			} 
		}

	}

}
