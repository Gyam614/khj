package generic2;

public class Service {
	
	//오버로딩은 제너럴을 따지지 않는다.
	
	
	public void drink( Bottle<? extends Alcohol> soju ) { //알코올 섭취
		System.out.println( soju.item );
		System.out.println("한 잔 마신다");
		
	}
	
//	public void drink (Bottle<?> mak) {
//		System.out.println(mak.item);
//		System.out.println("한 잔 마신다.");
//	}

}
