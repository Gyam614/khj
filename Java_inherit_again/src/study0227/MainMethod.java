package study0227;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire tire = new Tire();
		tire.setInch(18);
		
		Car car = new Car(tire);
		
		System.out.println(car.getTire().getInch());

	}

}
/* 
 	책    페이지 
 
 */



// 상속 관계와 포함관계

//		사람 / 개발자