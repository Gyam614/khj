package study0228;

public class MainMethod_0228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		김명준 준 = new 김명준();
		최예나 나 = new 최예나();
		
		준.moving();
		나.moving();
		
		Active 명준 = new 김명준();
		Active 예나 = new 최예나();
		명준.moving();
		
		
		Active 명준1 = new 김명준();
		명준1.target();
		Active 예나1 = new 최예나();
		예나1.target();

		
		int data = 13;
		System.out.println(Integer.toHexString(data));
	}

}


/* 
  서로 다른 클래스를 다형성으로 표현하고자 한다면
  인터페이스를 implements하면 된다.
  두 개 이상의 인터페이스를 연결구현하는 경우에는
  인터페이스가 서로 다르므로 각각 인터페이스 타입으로 사용해야한다.
  그럼 다형성의 의미가 사라지기 때문에,
  인터페이스들의 상속을 한다. 
 
  
  클래스들의 관계가 상속관계를 이룰 수 없는 경우에
  다형성으로 처리하고자 한다면 인터페이스를 이용
  또는 상속관계로 다형성을 구현하자 할 때에도 인터페이스를 사용
 
  게시판 - 공략게시판
  게시판 - 자유게시판
  
  게시판 부모클래스에 - (메서드) 게시글저장(save), 게시글보기(view), 
  
  CRUD (Create, Read, Update, Delete)
  게시판 - 저장, 보기, 수정, 삭제
  회원 - 저장, 보기, 수정, 삭제
  
  회원 - 가입(저장), 내정보(보기), 내정보 변경(수정), 탈퇴(삭제)
  		데이터베이스 동작이 필요하므로 저장, 보기, 수정, 삭제의 동작이
  		하나의 타입으로 처리가 가능하도록 만드는 것도 다형성.
  		
  
  */

