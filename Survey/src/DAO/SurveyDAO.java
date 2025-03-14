package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.Survey;

public class SurveyDAO extends DBconnect {
	
	public ArrayList<Survey> surveyOption() {
		
		String sql = "select * from survey";
		ArrayList<Survey> option = new ArrayList<Survey>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while(rs.next()) {
				Survey data = new Survey(
						rs.getInt("s_id"), rs.getString("option_text")
						);
				
				option.add(data);
			
				} 
			
			
		} catch(Exception e) {
			System.out.println("옵션 불러오기 에러");
			e.printStackTrace();
		}
		return option;
		
	}
	
	private void saveData() {
		
	}
	
	public void savaData(int age, int num) {
		String sql = "insert into answer(age, s_id) values("+age+", "+num+")";
		
		try {
			st.executeUpdate(sql);
			System.out.println("답변 등록 완료!");
			
		}catch(SQLException e) {
			System.out.println("답변 등록 실패");
			e.printStackTrace();
		}
		
	}

}
