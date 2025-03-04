package java0304;

public class MaintMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClass lc = new LocalClass();
		
		lc.getBirth();
		//지역 내부 클래스는 해당 메서드를 호출해야 사용가능
		
		Item item = new Item();
		item.sale();
		
		Item shoes = new Item() { //익명 클래스
			@Override
			public void sale() {
				make();
				System.out.println("신발 판매");
			}
			
			public void make() {
				System.out.println("신발 만들기");
				
			} // 익명 클래스 내에선 
			//반드시 오버라이딩을 통해서만 메서드 사용 가능
			
		}; //익명 클래스 정의와 객체 생성
		// Item 클래스가 부모 클래스가 되고 익명 클래스가 자식 클래스
		shoes.sale();
		
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("멍멍냠냠이");
			}
		}; //인터페이스를 implements한 익명클래스 정의와 객체
		dog.eat();
	}

}
@FunctionalInterface
interface Animal { //Animal 인터페이스 정의
	public void eat(); // 추상메서드
}


class A {
	
}

