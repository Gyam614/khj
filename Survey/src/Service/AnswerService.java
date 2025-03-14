package Service;

import java.util.ArrayList;

import DAO.AnswerDAO;
import VO.Answer;

public class AnswerService {
	
	private AnswerDAO dao;
	
	public AnswerService() {
		this.dao = new AnswerDAO();		
	}
	
	public String showStat() {
	System.out.println("\r\r===== 통계 계산 =====\r");
	ArrayList<Answer> list = dao.answerSearch();
	
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	for(Answer answer : list) {
		if(answer.getSId() == 1) {
			num1++;
		}
		if(answer.getSId() == 2) {
			num2++;
		}
		if(answer.getSId() == 3) {
			num3++;
		}
	}
	int avg1 = 100 * num1 / list.size();
	int avg2 = 100 * num2 / list.size();
	int avg3 = 100 * num3 / list.size();
	System.out.println("1번 비율: " + avg1 + "% | 2번 비율: " + avg2 + "% | 3번 비율: " + avg3 + "%");
	System.out.println("\r=====================\r");

		return null;		
	}
	
	public String showByAge() {
		
		System.out.println("\r\r===== 나이 오름차순 정렬 =====\r");	
		ArrayList<Answer> list = dao.orderByAge();
		for(Answer answer : list) {
		System.out.println("나이: " + answer.getAge() + " | 선택 항목: " + answer.getSId());
		}
		
		System.out.println("\r\r===== 나이 내림차순 정렬 =====\r");	
		ArrayList<Answer> listRev = dao.orderByAgeRev();
		for(Answer answer : listRev) {
		System.out.println("나이: " + answer.getAge() + " | 선택 항목: " + answer.getSId());
		}
		
		
		
		
		return null;
	}
	
public String showByDate() {
		
		System.out.println("\r\r===== 최근순 정렬 =====\r");	
		ArrayList<Answer> list = dao.orderByDate();
		for(Answer answer : list) {
		System.out.println("등록 번호: " + answer.getAId() + " | 선택 항목: " + answer.getSId());
		}
		
		
		
		
		return null;
	}



}
