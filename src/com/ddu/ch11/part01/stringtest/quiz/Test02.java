package com.ddu.ch11.part01.stringtest.quiz;



public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "korea@korea.com";
		String id = str.substring(0,5);
		String domain = str.substring(5);
		System.out.println( "아이디는 : " + id + " 도메인은 : " + domain +" 입니다");
	}

}
