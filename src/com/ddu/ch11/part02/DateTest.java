package com.ddu.ch11.part02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date nowTime = new Date();
		System.out.println(nowTime.toString());
		// Tue Jul 29 16:15:28 KST 2025
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String date2 = dateFormat.format(nowTime);
		String date3 = dateFormat2.format(nowTime);
		System.out.println(date2);
		// 2025년 07월 29일
		System.out.println(date3);
		// 2025년 07월 29일 04시 16분 41초
	
		// 현재시각 기준으로 2시간 후
		System.out.println(nowTime.getTime()+ (2*60*60*1000));
		long newTime = nowTime.getTime() + (2*60*60*1000);
		nowTime.setTime(newTime);
		System.out.println("지금부터 2시간 후 : " + nowTime);
	}

}
