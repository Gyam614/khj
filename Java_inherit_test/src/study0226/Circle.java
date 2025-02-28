package study0226;

public class Circle extends Diagram {
	
	public Circle() {
		super();
	};
	
	public Circle(int width) {
		super(width);
	}
	
	@Override
	public void draw() {
		System.out.println("지름이 '" + width + "'cm인 원을 그린다.");
	};

}
