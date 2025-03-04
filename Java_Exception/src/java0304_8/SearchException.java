package java0304_8;

public class SearchException extends Exception{
	private String errorCode;
	
	public SearchException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public void keywordMis() {
		System.out.println(" 검색어 잘못 입력 ");
	}
	
	
	
	
	
	

}
