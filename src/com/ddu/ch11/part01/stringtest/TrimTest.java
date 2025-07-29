package com.ddu.ch11.part01.stringtest;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("좋아하는 위인을 입력하세요 : ");
		String str = scanner.nextLine();

		System.out.println(str);
		// " 이순신"
		System.out.println(str.length());
		// 4
		
		
		System.out.println(str.trim());
		// "이순신"
		// 문자열 앞뒤의 스페이스 공백 제거 -> 원본은 수정되지 않음
		str = str.trim();
		System.out.println(str.length());
		// 3
		
		System.out.println(str.strip());
		// 문자열 앞뒤의 특수문자 및 스페이스 공백 제거 (더 큰 개념)
		str = str.strip();
		System.out.println(str.length());
	}	

}
