package study0218;

public class Member {
	
	String name;
	int age;
	String job;
	
	
	
	Member() { //우리는 이것을 기본 생성자 메서드라 부른다.
		this.name = "박문수"; //this: 클래스 내부에선 객체의 주소를 의미
	
		System.out.println(this);
	}
	
	//같은 이름의 함수를 생성하는 것은 '오버로딩(OVERLOADING)'이라고 한다.
	//어떤 타입의 데이터값이든 하나로 처리할 수 있도록 해준다.
	
	Member(int age, String job) {
		this.age = age;
		this.job = job;
	}
	
	Member(int age, String job, String name) {
		this.name = name;
		this.age = age;
		this.job = job;
		
		System.out.print(age + job + name);
		
	}
	
	// 오버로딩 조건
	// 1. 메서드 이름이 같아야 한다.
	// 2. 매개변수가 같으면 안된다.
	// 3.매개변수 갯수가 달라도 성립된다.
	// 4. ★★★★★ 하나의 클래스 내부에서만 가능하다. ★★★★★
	
	// 자바 변수 종류
	// ▶ 인스턴스 변수
	// ▶ 지역 변수(for문 안의 i같은거)
	// ▶ 클래스 변수
	// 우선순위 : 지역변수 > 인스턴스 변수 >= 클래스 변수
	
	
	//생성자 메서드
	
}



