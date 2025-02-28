package study0228;

public interface Active extends Move, Attack {
	//interface는 여러 명의 부모를 가질 수 있다. 
	public void moving();
	public void target();

}
