package collection2;

import java.util.ArrayList;
import java.util.Collections;

public class MainM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add(new Member(1l, "khj", "khj@gmail.com", "12345", "19980614"));
//		
//		list.add(new Member(2l, "more", "more@gmail.com", "001", "20250306"));
//		
//		System.out.println(list.get(0));
		
		
		MemberDao check = new MemberDao();
		
		ArrayList<Member> memberList = check.select();
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		
		
		//이메일로 아이디와 비밀번호를 조회하기!
		String email = "brown@gmail.com";
		for(Member mem : memberList) { 
			if(mem.getEmail().equals(email)) {
				System.out.println(mem.getMemberId() + " " + mem.getPassword());
				break;
			};
		}
		
		//memberList.contains(대상);
		//타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게
		// email은 String 클래스 타입이라 안된다.
		//Member 클래스 객체에 email을 담아서 비교되게 한다.
		
		
		Member 대상 = new Member();
//		대상.setEmail(email);
//		
//		for(int i=0; i<memberList.size(); i++) {
//			Member cmp = memberList.get(i);
//			
//			if(cmp.equals(대상)) {
//				System.out.println("찾았다!");
//				
//			}
//		}
		
//		System.out.println(memberList.contains(대상));
		
		//memberList에 등록된 사람들 중에서
		//장은호 생년월일과 같은 회원 있나? 
		
		Member 장은호 = new Member();
		장은호.setBirth("19901221");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
		
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		System.out.println("aag".compareTo("apple"));
		
		Collections.sort(memberList);
		for(Member m : memberList) {
			System.out.println(m.getId() + " " + m.getBirth() + " " + m.getAge());
		}
		
//		Collections.sort(memberList);
		
		
//		대상.setBirth("19901221");
//		
//		for(int i=0; i<memberList.size(); i++) {
//			Member cmp = memberList.get(i);
//			
//			if(cmp.equals(대상)) {
//				System.out.println("생일이 똑같은 사람이 있어!");
//				
//			} 
//		}
		
//		System.out.println(memberList.contains(장은호));
	}

}
