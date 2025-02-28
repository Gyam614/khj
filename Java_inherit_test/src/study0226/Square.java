package study0226;

public class Square extends Diagram {
	
	public Square() {
		super();
	}
	
	public Square(int width) {
		super(width);
	}
	
	@Override
	public void draw() {
		System.out.println("지름이 '" + width + "'cm인 사각형을 그린다.");
	};


}
