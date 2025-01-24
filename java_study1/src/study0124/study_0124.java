package study0124;

public class study_0124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 편의점에서 도시락 가격이 5200원.
		// 통장 잔액이 4530원, 얼마를 이체해야하나?
		// (잔액이 충분하다면 이체할 필요없다.)
		
		int lunchbox = 5200;
		int money = 4530;
		
		if (lunchbox > money) {
			System.out.println(lunchbox - money);
		} else System.out.println("이체할 필요가 없다.");
	}

}
