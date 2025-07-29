package com.ddu.ch11.part01.stringtest;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		// 문자열을 대문자 혹은 소문자로 변경
		
		String str1 = "KOREA";
		String str2 = "japan";
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase());
		// 소문자로 변경 (korea)
		System.out.println(str1);
		//원본은 수정 되지 않음 -> 새로운 변수에 저장해야함
		
		System.out.println(str2.toUpperCase());
		// 대문자로 변경 (JAPAN)
		
		if (str2.equals(str3)) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		//  두 문자열은 다르다.
	
		if (str2.equalsIgnoreCase(str3)) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}
		// 두 문자열은 같다.
		// 소문자 , 대문자를 구별하지 않고 비교
		
		// str2 = str2.toUpperCase(); -> 대문자로 변환 후 overwrite(덮어쓰기)
		// 두 문자열은 같다
		
	}

}
