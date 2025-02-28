package study0228_4;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteCon tvon = new Tv();
		RemoteCon aircon = new Aircon();
		RemoteCon lighton = new Light();
		
		
		tvon.turnOn();
		aircon.turnOn();
		lighton.turnOn();


	}

}
