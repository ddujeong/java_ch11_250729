package com.ddu.ch11.part01.stringtest;

public class JuminNumTest {
	// 주민번호에서 성별 출력 프로그램
	public static void main(String[] args) {
	
	String jumin = "990725-1234567";
	 char gender = jumin.charAt(7); { // index는 0부터 시작
	 
	 switch (gender) {
	 case '1': 
	 case '3': 
		 System.out.println("남자!");
		 break;
	 case '2': 
	 case '4': 
		 System.out.println("여자!");
		 break;	 
	 }
	 
	 }
}
}