package study0228_3;

public class MainMt_0228_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[4];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Chicken();
		animal[3] = new Dog();

		for (Animal ani : animal ) {
			ani.sound();
		}
		
		
	}

}

// 동물 소리
// 고양이 소리, 닭 소리, 강아지 소리
// 인터페이스 : Animal