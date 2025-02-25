package study0225;

public class Movie {
	private String title;
	private String genre;
	private int year;
	
	public Movie() {};
	
	public Movie(String title, String genre, int year){
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	// 우클릭 > Source > Generate Getters and Setters
	// Getset적용시킬 인스턴스 변수 체크한 뒤 Generate

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}




