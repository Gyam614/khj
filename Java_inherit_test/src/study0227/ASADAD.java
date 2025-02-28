package study0227;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ASADAD {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		Date today = new Date();
		System.out.println(today);
		//2025.02.27 (대한민국 날짜표기법)
		//2025/02/27 (일본 날짜표기법)
		
		//년도추출
		System.out.println(today.getYear() + 1900);
		
		//월 출력
		System.out.println(today.getMonth()+1);
		
		//일 출력 (getDay는 요일임)
		System.out.println(today.getDate());
		
		//시, 분, 초
		System.out.println(today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds());
		
		
		
		//소문자 y: 년 | 대문자 M: 달 | 소문자 d: 일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String myDate = sdf.format(today);
		System.out.println(myDate);
		
		SimpleDateFormat time = new SimpleDateFormat("지금은 hh시 mm분 ss초야.");
		String myTime = time.format(today);
		System.out.println(myTime);
		
		//날짜 차이 구하기
		//2024.12.18부터 오늘까지 몇일인지 구하기
		
		Date start = new SimpleDateFormat("yyyy.MM.dd").parse("2024.12.18");
		
		long difsec = (today.getTime() - start.getTime() ) / 1000;
		System.out.println(difsec);
		
		long difmin = difsec/60;
		System.out.println(difmin);
		
		long difhour = difmin/60;
		System.out.println(difhour);
		
		long difday = difhour/24;
		System.out.println(difday);
		
		
		
		
		
		
	}

}
