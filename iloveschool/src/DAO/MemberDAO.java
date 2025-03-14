package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBconnect{

	public boolean userIdAndPassword(String mId, String mPw) {
		// TODO Auto-generated method stub
		String sql = "select * from member1 where member_id='"+mId+"' and password = '"+mPw+"'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) { //조회 결과가 있다면 next는 true, 없다면 false
				return true; //로그인 성공했으니까 true 변환
				
			}
			
		} catch(SQLException e) {
			System.out.println("아이디 비번 조회 실패");
			e.printStackTrace();
		}
		
		return false; // 로그인 실패(아이디 또는 비번 잘못) false 변환
	}

}
