package generic2;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Bottle<String> b1 = new Bottle<String>();
		//Bottle클래스의 제네릭 타입으로 String 지정
		//String item으로 변경,
		//make 메서드의 매개변수 String item으로 변경
//		b1.make("레몬소주");
		
		Soju sj = new Soju("참이슬","진로",16);
		Wine wn = new Wine("디안느소비뇽","앙드레뤼통",12);
		Makgeolli mg = new Makgeolli("공주밤막걸리","사곡양조원",6);
		
		
		Bottle<Soju> 참이슬 = new Bottle<>();
		참이슬.make( sj );
		
		Bottle<Alcohol>술병 = new Bottle<>();
		술병.make(wn);
		
//		술병 = 참이슬; <<오류남 | 제네릭 타입(성질)이 달라서 성립이 안된다.
//						형변환도 안됨 
		
		Alcohol ach = sj;
		
		Bottle<Wine> 소비뇽 = new Bottle<>();
		소비뇽.make( wn );
		
		Bottle<Makgeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make( mg );
		
		Bottle<Alcohol> 소주병 = new Bottle<>();
		소주병.make( sj);
		
		Service 은호 = new Service();
		은호.drink(참이슬);
		
//		Bottle<Toy> 티니핑 = new Bottle<>();
//		티니핑.make(new Toy());
		
//		소주병.make( );

	}

}



/*
 
  제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
  	Member<Admin> a = new Member<>();
  	-> Member 클래스 내부에 Admin 이라는 타입을 사용한다.
  	-> Member 클래스는 class Member<T>로 정의되어 있어야 한다.
  	-> 클래스 내부의 인스턴스 변수나 인스턴스 메서드의 매개변수 타입 또는 반환 타입을
  		제네릭 타입으로 표현 가능하다.
  Member<Admin> a = new Member<>() 는 Admin 클래스의 객체 생성이 아니다.
  Member 클래스의 객체 생성이다.
  
  	- 제네릭을 사용하는 클래스인 경우 해당 클래스의 참조변수들은 Member<Admin>까지를
  		타입으로 인지한다.
  	- 제네릭에서는 상하 관계가 없다.
  		(제네릭 타입으로 부모 클래스나 자식 클래스를 사용해도 
  		대입 연산이 이루어지지 않는다.)
  	- 제네릭을 사용하므로 타입에 대한 예외 상황을 방지할 수 있다.
  		(컴파일 과정에서 발생할 수 있는 오류 최소화)
  	- 제네릭 사용 범위 제한은 extends와 super이다.
  	- 메서드에만 제네릭 사용 되는 경우 와일드카드<?>를 사용하는게 여러 타입 처리 가능
  	- 와일드카드의 범위 제한은 extends, super이다.
 
 */

