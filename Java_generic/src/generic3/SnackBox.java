package generic3;

public class SnackBox <T extends Snack>{
	T item;
	
	public void makeBox(T item) {
//		System.out.println("과자 박스 만들기");
		this.item = item;
		System.out.println(item);
	}
	
//	public T getItem() {
//		return this.item;
//	}

}
