package com.ddu.ch11.part01.stringtest.quiz;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(i) != i ) {
				String str1 = str + i;
				System.out.println(str1);
				}
		}
	}

}
