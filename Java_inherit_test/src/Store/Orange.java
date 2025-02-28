package Store;

public class Orange extends PFruit {
	 public Orange(int cost, int capacity) {
		 super(cost,capacity);
		 
//		 System.out.println("오렌지 " + cost + "원, " + capacity + "ml" );
	 }
	 
	 
	 
	 @Override
	 public void makeJuice() {
		 System.out.println("오렌지 주스 제조");
	 }
	 
	 @Override
	 public void pieceFruit() {
		 System.out.println("오렌지 여섯 조각");
	 }

	 @Override
	 public String toString() {
		 return("오렌지 " + cost + "원, " + capacity + "ml" );
	 }
	 
}
