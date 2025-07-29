package com.ddu.ch11.part01.stringtest.quiz;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello123, Java456";
		
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if (ch >= 65 && ch <= 90) {
				count++;
			}else if (ch>= 97 && ch<= 122) {
				count++;
			}
		}System.out.println("알파벳의 갯수는 : " + count +" 개 입니다.");
	}

}
