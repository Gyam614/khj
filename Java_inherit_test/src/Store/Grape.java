package Store;

public class Grape extends PFruit {
	 public Grape(int cost, int capacity) {
		 super(cost,capacity);
		 
//		 System.out.println("포도 " + cost + "원, " + capacity + "ml" );
	 }
	 
	 
	 
	 @Override
	 public void makeJuice() {
		 System.out.println("포도 주스 제조");
	 }
	 
	 @Override
	 public void pieceFruit() {
		 System.out.println("포도 열 알");
	 }
	 
	 @Override
	 public String toString() {
		 return("포도 " + cost + "원, " + capacity + "ml" );
	 }
	 
}
