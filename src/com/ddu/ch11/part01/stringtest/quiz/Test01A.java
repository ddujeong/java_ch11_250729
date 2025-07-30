package com.ddu.ch11.part01.stringtest.quiz;

public class Test01A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcabc";
		String strTarget = "ab";
		int count =0;
		
		for (int i = 0; i <= str.length() - strTarget.length(); i++) {
			if (str.substring(i, i+strTarget.length()).equals(strTarget)) {
				// 1회전)i = 0 0~2 -> "ab" true
				// 2회전)i = 1 1~3 -> "bc" false
				// 3회전)i = 2 2~4 -> "ca" false
				// ....
				// 7회전)i = 6 6~8 -> "bc" false
				count++;
			}
			
		}System.out.println(count);
	}

}
