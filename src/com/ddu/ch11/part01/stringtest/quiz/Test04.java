package com.ddu.ch11.part01.stringtest.quiz;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="i like chopin";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(str.charAt(i)).equals(" ")) {
				str2 = str2 + String.valueOf(str.charAt(i +1)).toUpperCase();
			} else {
				str2 = str2 + str.charAt(i);
			}
			
		}System.out.println(str2);
	}

}// 미완성
