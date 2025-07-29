package com.ddu.ch11.part01.stringtest;

public class StringTestAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'H';
		if (ch >=65 && ch <= 90) {// 65 -> 대문자 A 아스키 90 -> 대문자 Z 아스키 코드값
			System.out.println(ch+"는 영문자 대문자 입니다.");
		} else if (ch>= 97 && ch<= 122) {
			System.out.println(ch +"영문자 소문자 입니다.");
		} else {
			System.out.println(ch+"는 영문자 대문자가 아닙니다.");
		}
	}

}
