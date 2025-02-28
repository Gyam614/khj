package study0225;

public class study_0225_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product tv = new TV("삼성", 950000, "TV이름티비");
		Product com = new Computer("NVIDIA", 2100000, "컴티비");
		Product air = new Aircon("캐리어", 542000, "에어컨티비");
		
		tv.power();
		com.power();
		air.power();
		

		

	}

}


/* 상속 - 클래스들의 관계를 부모-자식 관계로 설정한다.
 		부모클래스의 변수 또는 메서드를 자식 클래스에서 사용 가능.
 		여러 클래스들의 공통 요소를 부모 클래스로 구성한다.
 		예) TV, 컴퓨터, 냉장고, 에어컨
 			전기(파워), 플러그, 가격, 브랜드, 등등등
 			가전제품 부모클래스 에 파워, 가격, 브랜드를 정의한다.
 			
 		다형성 - 다양한 형태
 			TV t = new TV();
 			Computer com = new Computer();
 			
 			가전게품 com = new Computer();
 			가전제품 tv = new TV();
 			 ㄴ 부모객체이기 때문에 다른 클래스임에도 객체를 만들 수 있다.
 			
 
 
 */



