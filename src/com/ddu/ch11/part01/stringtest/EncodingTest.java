package com.ddu.ch11.part01.stringtest;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요!";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		// [B@372f7a8d
		System.out.println(bytes1.length);
		// 16
		String str2 = new String(bytes1);
		System.out.println(str2);
		// 안녕하세요!
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			// 11
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			// 16
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
