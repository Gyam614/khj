package generic3;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	포스틱 pos = new 포스틱("포스틱", 2000);
//	포스틱 postic = new 포스틱("포스틱2세", 2200);
	예감 yeah = new 예감("예감", 1500);
	매운새우깡 saeu = new 매운새우깡("매운새우깡", 1700);
	매운새우깡 sauKkang = new 매운새우깡("짱매운새우깡",1900);
	
//	System.out.println(pos);
	
	
	
	SnackBox<포스틱> 포스틱상자 = new SnackBox<>();
	포스틱상자.makeBox(new 포스틱("포스틱", 2000));
	
	Snack 포스틱2 = new 포스틱("포스틱", 1700);
	
	SnackBox<포스틱> 포스틱2세상자 = new SnackBox<>();
	포스틱2세상자.makeBox((포스틱)포스틱2);
	
	System.out.println("-----------------------------\r");
	
	SnackBox<예감> 예감상자 = new SnackBox<>();
	예감상자.makeBox(yeah);
	
	System.out.println("-----------------------------\r");
	
	SnackBox<매운새우깡> 매새깡상자 = new SnackBox<>();
	매새깡상자.makeBox(saeu);
	SnackBox<매운새우깡> 짱매새깡상자 = new SnackBox<>();
	짱매새깡상자.makeBox(sauKkang);

	}

}
