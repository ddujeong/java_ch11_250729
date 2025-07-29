package com.ddu.ch11.part01.stringtest.quiz;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		String str2 ="";
		for (int i = 0; i < str.length() ; i++) {
		 char a =str.charAt(i);
		 if (str2.indexOf(a) == -1) {
			 str2 =str2 + a;
		 }
			
		}System.out.println(str2);
		}

}
