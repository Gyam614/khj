package study0226;

public class Triangle extends Diagram {
	
	public Triangle() {
		super();
	}
	
	public Triangle(int width) {
		super(width); 
	} //부모클래스와 같은 생성자 메서드를
     //자식클래스에서도 같이 생성해줘야함!
	
	@Override
	public void draw() {
		System.out.println("지름이 '" + width + "'cm인 삼각형을 그린다.");
	};

}
