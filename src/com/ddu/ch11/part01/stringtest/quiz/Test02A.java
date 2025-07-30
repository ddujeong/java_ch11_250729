package com.ddu.ch11.part01.stringtest.quiz;

public class Test02A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "korea@korea.com";
		
		int at_index = email.indexOf("@"); // @의 인덱스
		String emailId = email.substring(0,at_index);
		String emailDomain = email.substring( at_index+1);
		
		System.out.println( "아이디는 : " + emailId + " 도메인은 : " + emailDomain +" 입니다");
	}

}
