package com.ddu.ch11.part02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calnow = Calendar.getInstance();
		
		int year = calnow.get(Calendar.YEAR);
		int month = calnow.get(Calendar.MONTH) + 1;
		// month는 + 1 해줘야함 (0부터 시작)
 		int day = calnow.get(Calendar.DAY_OF_MONTH);
 		int hour = calnow.get(Calendar.HOUR);
 		int minute = calnow.get(Calendar.MINUTE);
 		int second = calnow.get(Calendar.SECOND);
		System.out.println(year+"년" + month+ "월" + day+"일");
		System.out.println(hour+"시" + minute+ "분" + second+"초");
		
		
		// 요일 출력하기
		int weekday = calnow.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘의 요일: " + weekday);
		// 오늘의 요일: 3
		System.out.println("오늘의 요일: " + Calendar.TUESDAY);
		// 오늘의 요일: 3
		
		if (weekday == Calendar.TUESDAY) {
			System.out.println("오늘은 화요일 입니다!");
		}else {
			System.out.println("오늘은 화요일이 아닙니다.");
		} // 오늘은 화요일 입니다!
	}

}
