package java0228_6;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test.A a = new Test.A(); << 오류뜸
		Test t = new Test();
		
		
		
		t.setNum(10); //내부클래스가 노출 안됨
		
		t.innerView();
		
		//정적 내부 클래스를 굳이 노출하면서 객체를 만들고자 한다면..
		Test.Dog dog = new Test.Dog(); //A클래스는 안되었던 것!
		Test.origin(); //클래스 메서드 실행은 객체 없이 가능하다.
		
		
		
		
		
		
		
		
		
		
		
	}

}
