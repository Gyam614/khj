package study0228_5;

public class BoardService extends DBConnect implements CRUD {

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		System.out.println("게시판 저장 완료!");
		return false;
	}

	@Override
	public CRUD select() {
		// TODO Auto-generated method stub
		System.out.println("게시판 조회 완료!");
		return null;
	}

	@Override
	public CRUD update() {
		// TODO Auto-generated method stub
		System.out.println("게시판 수정 완료!");
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		System.out.println("게시글 삭제!!");
		return false;
	}

}
