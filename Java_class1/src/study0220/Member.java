package study0220;

public class Member {

	String userId; //유저 아이디
	String password; //유저 비밀번호
	long id; //회원번호
	
	Member() {
	
	}
	
	Member(String userId, String password, long id){
		this.userId = userId;
		this.password = password;
		this.id = id;
	}
}
