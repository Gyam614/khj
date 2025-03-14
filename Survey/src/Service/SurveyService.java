package Service;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.SurveyDAO;
import VO.Survey;


public class SurveyService {
	
	private SurveyDAO dao;
	Scanner scan = new Scanner(System.in);
	
	  public SurveyService() {
	        this.dao = new SurveyDAO();  // SurveyDAO 객체를 전달받아 초기화
	    }
	
	
	
	public void seolmun() {
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		System.out.println("\r===== 질문: 세상을 멸망시키고 싶으십니까? =====\r");
		
		int dapp = answering();
		
		dao.savaData(age, dapp);
		
	}
	
	
	private int answering() {
		ArrayList<Survey> select = dao.surveyOption();
		for(Survey survey : select) {
			System.out.println(survey.getSId() + "번: " + survey.getOptionText());
			
		}
		System.out.print("답 선택: ");
		int num = scan.nextInt();
		
		return num;
	}
	

}
