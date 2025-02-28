package java0228_6;

public class Test {
	
	static int count=1; //클래스 변수(정적 변수)
	int age; //인스턴스 변수
	A a;
	static Dog d;
	
	Test() {
		a = new A();
	}
	
	static void origin() { //클래스 메서드에서는: 
//		a.view(); << 오류뜸!
//		A bb = new A(); << 오류뜸!
	}
	
	//정적 내부 클래스 (static)
	static class Dog{
		int year;
	
	}
	void setYear(int year) {
		Dog d = new Dog();
		d.year = year;
	}
	
	
	
	
	//인스턴스 내부클래스 정의  - 외부클래스의 객체를 생성해야 사용
	class A{
		int num; //A라는 클래스의 인스턴스 변수 num
		void view() {System.out.println("내부클래스 메서드야!");}
	}
	
	void innerView() { //인스턴스 매서드
		this.a.view();
	} //감춰!
	
	void setNum(int num) {
		this.a.num = num;
	}
	
	void sum() {
		int a,b; //지역 변수
	}

}


//내부 클래스 - 클래스 내부에 만들어지는 클래스

/* 
		static 변수 또는 메서드
		-> 프로그램 실행하면서 클래스가 메모리에 로드 되면 공간 할당
		
		인스턴스 변수 또는 메서드
		-> new 연산자 통해 클래스의  공간을 생성해야 존재
		
		지역변수
		-> 메서드를 호출해야 생성
		
	
	순서: static 변수 또는 메서드 -> 인스턴스 변수 또는 메서드 -> 메서드 호출해야 지역변수 생성

*/