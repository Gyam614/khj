package study0131;

import java.util.Scanner;

public class study_0131_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//싸다구 주차장 주차비 결제
		//주차장의 기본 요금은 1000원. 기본 시간 30분.
		//11분 주차해도 1000원.
		//10분당 100원씩 추가요금
		//34분 주차하면 1000원, 40분 주차하면 1100원
		//51분 주차하면 1200원
		
		Scanner scan = new Scanner(System.in);
		
		int price = 1000;
		int fee= 100;
		
		System.out.print("주차 시간: ");
		int time=scan.nextInt();
		
		if (time==0) {
			System.out.println("주차 요금: 0"); }
			else if(time<40) {
			System.out.println("주차 요금: " + price);
		} else 
		{
			System.out.println("주차 요금: " + (price + ((time-30)/10*fee) + "원"));
		} 
		
		
		//싸다구 주차장 주차비 결제
		//주차장의 기본 요금은 1000원. 기본 시간 30분.
		//11분 주차해도 1000원.
		//10분당 100원씩 추가요금
		//34분 주차하면 1000원, 40분 주차하면 1100원
		//51분 주차하면 1200원
		// 2시간 이상 주차시 기본 요금은 1700원
		// 2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		// 4시간 이상 주차시 기본 요금은 2500원
		// 4시간 15분 주차면 2600원
		// 8시간 이상 주차하면 무조건 10000원 (더 넘어가도 추가요금XX)
		
		
		//주차를 몇 분 했는지 입력하여, 주차요금이 얼마인지 출력하세요.
		
		
		
	}

}
