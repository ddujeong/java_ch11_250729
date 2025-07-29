package com.ddu.ch11.part01.stringtest.quiz;

public class Test01 {
//	1. "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcabc";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {	
			if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') { 
				count++;
			}		
		}System.out.println(str + "문자열 내에 'ab'가 " + count + "번 들어갑니다");
	}
}
