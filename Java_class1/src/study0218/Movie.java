package study0218;

public class Movie {
	
	
	//인스턴스 변수들
	String title; //영화 제목
	String genre; // 영화 장르
	int visit; // 영화 관객수
	int openDate; //영화 개봉일

	
	Movie() {
		
		//클래스 내부에서 인스턴스 변수를 표현하려면 this를 사용
		//this를 생략해도 JAVA 내부에서 알아서 처리해주긴 하지만?
		//웬만하면 this를 붙여놓자.
		this.genre = "감동물";
		System.out.println(this + " | " + this.genre);
		
	}
	
}
