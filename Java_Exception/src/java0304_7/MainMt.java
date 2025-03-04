package java0304_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//오류가 발생해도 오류가 없어도 무조건 실행
//		Scanner sc = new Scanner(System.in);
//		int money=100;
//		int total=0;
//		
//		try {
//			System.out.print("현금: ");
//			money = sc.nextInt();
//			total = money*5;
//			
//		} catch(Exception e) {
//			System.out.println("숫자만 입력하세요!");
//			
//		} finally { //오류가 나든 안나든 반드시 실행됨.
//			System.out.println("총금액: " + total);
//			
//		}
		

		
		
		String fileName = "c://test//data.txt";
		
		//자동 자원 반환 - 파일 열기와 같은 작업 시 사용한 컴퓨터 자원(메모리, 버퍼 등)
		// 					을 반환해야한다. 자동으로 반환까지 해주는 try ~ catch
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			System.out.println(line); 
			
		}catch(Exception e) {
			System.out.println("파일 얼고 읽기 오류");
			e.printStackTrace();
		}
		

		
//		
//			try { //파일에 있는 텍스트 읽기.
//				
//		BufferedReader read = new BufferedReader(new FileReader(fileName));
//			String line = read.readLine();
//			System.out.println(line); 
//			
//			} catch(Exception e) {
//				System.out.println("파일 열고 읽기 오류");
//				e.printStackTrace();
//				
//			}
//		
		
		
		
		
		
		
		
		
		
		

	} //main 끝

} //클래스 끝
