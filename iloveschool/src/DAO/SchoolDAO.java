package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.School;

public class SchoolDAO extends DBconnect {

	public ArrayList<School> searchSelect(String searchWord) {
		
		String sql = "select * from school where school_name like" + "'%"+searchWord+"%'";
		ArrayList<School> list = new ArrayList<School>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				School data = new School(
					rs.getInt("Id"), rs.getString("diff"), 
					rs.getString("school_name"), rs.getString("address"),
					rs.getInt("post_code"), rs.getString("tel"), rs.getString("fax"),
					rs.getString("education_office"), rs.getString("public_private"),
					rs.getString("homepage")
						);
				
				list.add(data);
				
				
			}
		
		} catch(SQLException e) {
			System.out.println("학교 검색 실패");
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}
	
	private void saveData() {
		// TODO Auto-generated method stub
		//테이블에 저장할 것. 
		
	}

	public void saveData(String id, int schoolNum) {
		// TODO Auto-generated method stub
		//id변수는 로그인한 아이디이고, schoolNum은 선택한 학교 번호(id)이다.
		//insert, delete, update는 executeUpdate 메서드를 사용하고
		//결과는 없기에 ResultSet으로 안받아도 된다.
		//내가 선택한 학교번호가 테이블에 저장될 수 있게 savaData 메서드 내용을
		//완성하세요.
		//1분단, 2분단, 3분단, - 경쟁 !
		//어느 분단에서 가장 먼저 전부 만드는지 !! 
		//가장 늦게 만드는 분단은 벌칙? 벌점? 암튼 머있음!!
		
		String sql = "insert into my_school(member_id, school_id) values('"+id+"',"+schoolNum+")";
		
		try {
			st.executeUpdate(sql);
			System.out.println("저장 성공!");
			
		} catch(SQLException e) {
			System.out.println("내 학교 등록 실패");
			e.printStackTrace();
		}
		
		
	}

}
