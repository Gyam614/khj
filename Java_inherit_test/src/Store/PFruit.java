package Store;

public abstract class PFruit { //부모 클래스 - 추상 클래스
	protected int cost; //판매 금액
	protected int capacity; // 용량
	
	protected PFruit() {};
	protected PFruit(int c,int cp) {
		this.cost = c;
		this.capacity = cp;

		
		
		
	}
	
//	public PFruit(int c, int cp) {
//		
//	}
	

	public abstract void makeJuice(); //과일 주스 만들기
	public abstract void pieceFruit(); //과일 소량 컵?에 팔기
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
