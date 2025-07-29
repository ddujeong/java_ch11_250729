package com.ddu.ch11.part01.stringtest;

public class ByteToStringTest {

	public static void main(String[] args) {
		// ASKII 코드 값(7bit)
		byte[] bytes = {72,101,108,108,111}; // Hello 의 아스키코드 값 배열
		
		String str1 = new String(bytes);
		System.out.println(str1);
		// Hello
		
		String str2 = new String("Hello");
		System.out.println(str2);
		// Hello
		
	}

}
