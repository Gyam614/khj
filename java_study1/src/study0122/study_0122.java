package study0122;

public class study_0122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//증감 연산자 ++, --
		
		int a = 10, b=10, result=0;
		// ++
		
		System.out.println("++전: " + a);
		a++;
		System.out.println("++후: " + a);
		
		++a; //뒤에다 배치해도 상관없음.
		System.out.println("++a: " + a);
		
		
		//증감연산자의 위치가 변수앞, 변수뒤 차이
		a=10;
		result = a++;
		System.out.println( "result = a++ : " + result );
		// 연산 순서: result = a => a=a+1;

		result = ++b;
		System.out.println("result = ++b: " + result);
		// 연산 순서: b=b+1 => result=b;
		
		// 대입연산자가 증감연산자보다 우선순위가 낮다. 
		
		//증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		//증감연산자를 변수 뒤에 붙이면 우선순위가 하위권
		
	}

}
