package com.ddu.ch11.part01.stringtest.quiz;

public class Test03A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		String result = ""; // int sum =0;
		
		for (int i = 0; i < str.length(); i++) {
			if (result.indexOf(str.charAt(i)) == -1) {
				result = result + str.charAt(i);
			}
		}System.out.println(result);
	}

}
