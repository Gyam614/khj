package study0228_5;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CRUD member = new MemberService();
		CRUD board = new BoardService();
		
		member.save();
		
		DBConnect mem = new MemberService();
		

	}

}
