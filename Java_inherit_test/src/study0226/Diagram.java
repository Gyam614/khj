package study0226;

public abstract class Diagram {
	protected int width;
	
	public Diagram() {};
	
	protected Diagram(int width) {
		this.width = width;
	}
	
	public abstract void draw();

}
