package java0304_8;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String keyword = "찬양";
		String content = "나는 어제 친구와 술을 마셨다. 그 친구의 이름은 " + "찬약!!";
		
		try {
		if(!content.contains(keyword)) {
			throw new SearchException("검색결과 없음.","111");
		}

	}catch(SearchException s) {
		s.keywordMis();
		s.printStackTrace();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
