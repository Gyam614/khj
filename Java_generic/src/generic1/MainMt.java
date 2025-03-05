package generic1;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//generic이 붙은 클래스의 객체를 만드는 법: 
		Drink<String> d = new Drink<String>();
		d.name = "토마토주스";
		d.ml = 350;
		
		d.경림추천(d.name);
	System.out.println(d.ml);
	
		
		// 기본 타입의 클래스 리스트!
		
		Integer m; //int 기본타입의 자바 클래스명
		Float f; //float 기본타입의 자바 클래스명
		Double db; //double 기본타입의 자바 클래스명
		Byte bt; //byte 기본타입의 자바 클래스명
		Short s; //short 기본타입의 자바 클래스명
		Long l; // long 기본타입의 자바 클래스명
		Character c; //char 기본타입의 자바 클래스명
		Boolean bl; //boolean 기본타입의 자바 클래스명
		
		
		/*
		 제네릭 - 속에 특유한, 속명 상표명 - 일반명
		 	  - 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
		 	  - 제네릭 타입으로는 무조건 클래스 타입, 인터페이스만 가능
		 	  
		 -> int : Interger 클래스
		 	  class A {
		 	  		int num;
		 	  		float fnum;
		 	  		String name; << 클래스 내부에서 직접 타입을 지정해주는 것들
		 	  		
		 	  
		 	  }
		  
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
