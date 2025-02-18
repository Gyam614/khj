package study0217;

public class study_0217_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//데이터 저장 - 변수
		// 같은 타입의 많은 양의 데이터 - 배열
		
		// 이름, 나이, 직업, 몸무게, 시력, 생년월일
		// 100명의 데이터를 저장하기 위해서는
		// 서로 다른 종류의 데이터기에 100의 크기인 1차원 배열 6개를 만들어야한다.
		//String[] names = new String[100];
		
//		struct member {
//			String name;
//			int age;	
//		}
//		member info; //member 타입의 변수 info
//		
//		info.name = "김유신";
//		info.age=24;
//		member[] mem = new member[100];
//		(이건 java에선 안먹히는 코드임)
		
		
		
// 클래스 - 사용자 정의 데이터 타입
// class 클래스 이름 { } -> 처럼 작성
// 클래스 이름은 첫글자 대문자로
		
// 프로그래밍 명명 규칙(name rule)
// 1. 카멜 표기법
//		첫문자를 제외하고 단어의 첫글자를 대문자로 표현
//		myVisitorCount
//		함수, 인스턴스, 객체, 변수
// 2. 스네이크 표기법
//		모든 단어 사이에 _를 붙여서 이름 짓기
//		my_visitor_count
//		데이터베이스의 테이블명, 컬럼명
// 3. 파스칼 표기법
//		카멜 표기법과 유사하지만, 첫문자부터 대문자로 표기
//		MyVisitorCount
//		객체 지향 언어의 클래스나 constructor명
// 4. 케밥 표기법
//		케밥표기법과 달리 소문자로 표현하며 단어와 단어 사이에 - 붙이기
//		my-visitor-count
//		css의 class명, web url(웹주소)
	
		
		
// 기본 데이터 타입으로 선언한 변수는 데이터 저장이 직접 가능하다.
// int num = 10;
// 배열 또는 클래스 타입으로 선언한 변수는 참조변수이다.
// 참조변수에는 메모리주소 저장.
// 자바에서는 new 연산자 통해서 공간을 할당받아 그 곳의 주소를 저장.
		
		Member info = new Member();
		info.name = "아몬드"; //이 각 하나의 클래스타입 데이터는 인스턴스라 부름.
		info.age = 30;
		System.out.println(info.name);
		//이 지정한 class타입 변수에 저장된 데이터를 통틀어서 객체라고 표현한다.

		
		
		Member my = new Member(); // 인스턴스 생성 (객체 생성)
		my.name = "브리즈";
		my.age = 25;
		System.out.println(my.name);
		
		
		// 동물종류, 동물이름, 나이
		// 동물종류에는 개, 고양이, 닭, 토끼, 코끼리 등등
		// 동물이름을 볼트, 렉스, 
		// 나이는 하고 싶은 나이 아무거나
		// 동물 한 마리에 대해서 데이터 입력하고 출력
		
		Animal dog = new Animal();
		dog.species = "개";
		dog.animalName = "코코";
		dog.age = 8;
		
		Animal cat = new Animal();
		cat.species = "고양이";
		cat.animalName = "유자";
		cat.age = 2;
		
		Animal chicken = new Animal();
		chicken.species = "닭";
		chicken.animalName = "퇴계 이황";
		chicken.age = 5;
		
		Animal rabbit = new Animal();
		rabbit.species = "토끼";
		rabbit.animalName = "익스트림 브릴리언트 알렉산드리아 밤비 3세";
		rabbit.age = 1;
		
		Animal elephant = new Animal();
		elephant.species = "코끼리";
		elephant.animalName = "뚱쭝이";
		elephant.age = 30;
				
		
		System.out.println("이름: " + dog.animalName + " | 종: " + dog.species + " | 나이: " + dog.age);
		System.out.println("이름: " + cat.animalName + " | 종: " + cat.species + " | 나이: " + cat.age);
		System.out.println("이름: " + chicken.animalName + " | 종: " + chicken.species + " | 나이: " + chicken.age);
		System.out.println("이름: " + rabbit.animalName + " | 종: " + rabbit.species + " | 나이: " + rabbit.age);
		System.out.println("이름: " + elephant.animalName + " | 종: " + elephant.species + " | 나이: " + elephant.age);
		
		
		
	}

}

// 클래스 - 데이터 저장 , 기능 구현
//	클래스 정의 - 클래스 안의 내용으로 데이터가 저장될 수 있게 정의만 한 것.	

class Member {
	String name; //이름 저장 (변수 저장하듯, 타입과 변수명을 지정)
	int age; // 나이
	float eyes; //시력 저장
}

class Animal {
	String species;
	String animalName;
	int age;
}