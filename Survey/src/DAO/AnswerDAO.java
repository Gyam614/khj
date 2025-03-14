package DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import VO.Answer;


public class AnswerDAO extends DBconnect {
	
	public ArrayList<Answer> answerSearch() {
		String sql = 
		"select * from answer";
		ArrayList<Answer> option = new ArrayList<Answer>();
		
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while(rs.next()) {
				Answer data = new Answer(
						rs.getInt("a_id"),
						rs.getInt("age"),
						rs.getInt("s_id")
						);
				
				option.add(data);
				
			
			
			
				} 

		} catch(Exception e) {
			System.out.println("통계 조회 실패");
			e.printStackTrace();
		};
		return option;

	}	
	
	//오름차순 정렬
	public ArrayList<Answer> orderByAge() {
		ArrayList<Answer> op = answerSearch();
		
		try {
		Collections.sort(op, new Comparator<Answer>() {
			@Override
			public int compare(Answer a1, Answer a2) {
				return Integer.compare(a1.getAge(), a2.getAge());
			}
		});
	} catch(Exception e) {
		System.out.println("나이 오름차순 정렬 실패");
		e.printStackTrace();
		
		

	}	
		return op;
	}
	
	//내림차순 정렬
	public ArrayList<Answer> orderByAgeRev() {
		ArrayList<Answer> op = answerSearch();
		
		try {
		Collections.sort(op, new Comparator<Answer>() {
			@Override
			public int compare(Answer a1, Answer a2) {
				return Integer.compare(a2.getAge(), a1.getAge());
			}
		}); 
		} catch(Exception e) {
			System.out.println("나이 내림차순 정렬 실패");
			e.printStackTrace();
		}
	
		
		return op;
		

	}	
	
	public ArrayList<Answer> orderByDate() {
		ArrayList<Answer> op = answerSearch();
		
		try {
		Collections.sort(op, new Comparator<Answer>() {
			@Override
			public int compare(Answer a1, Answer a2) {
				return Integer.compare(a1.getAId(), a2.getAId());
			}
		});
	} catch(Exception e) {
		System.out.println("나이 오름차순 정렬 실패");
		e.printStackTrace();
		}
		return op;
		
	}
}
