package study0228_5;

public class MemberService extends DBConnect implements CRUD {

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		System.out.println("회원가입 완료!");
		return false;
	}

	@Override
	public CRUD select() {
		// TODO Auto-generated method stub
		System.out.println("회원 정보 조회 완료!");
		return null;
	}

	@Override
	public CRUD update() {
		// TODO Auto-generated method stub
		System.out.println("회원 정보 수정 완료!");
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		System.out.println("회원 탈퇴!!");
		return false;
	}

}
