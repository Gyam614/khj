package java0304_6;

public class Member {
	private String name;
	private int age;
	
	public Member() {}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void nameCount() {
		
		if (name == null) {
			throw new NullPointerException("이름이 입력되지 않았어!"); //일부러 오류 내기
			//예외 발생시키기-throw
		}
		
		if (name.length()==2) {
			System.out.println("이름이 외자이다.");
		} else if (name.length()==4) {
			System.out.println("이름이 3자이다.");
		} else if(name.length()==3) {
			System.out.println("이름이 2자이다.");
		}
//		new NullPointerException("이름 입력안함");
	}
	
	public int getBirthYear() throws Exception{ //throws:책임회피 언어..
		if (age == 0) { //나이 입력 안한 경우
			throw new Exception("나이가 입력 안됐어!");
			
			
		}
		
		
		
		
		return 2025-age;
	}

}
