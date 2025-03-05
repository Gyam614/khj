package generic1;

public class Drink<T>{ //<T> : T라는 이름으로 generic 타입을 지정하고 사용할 것이다.
	T name; //일반적으로 generic 타입을 지정할 때에는 알파벳 T를 사용한다고 함. (아무거나 상관없긴 함..)
	//이렇게 지정해준 변수 타입은 Object

	int ml;
	
	public void 경림추천(T name) {
		this.name = name;
		System.out.println( this.name );
	}
}
