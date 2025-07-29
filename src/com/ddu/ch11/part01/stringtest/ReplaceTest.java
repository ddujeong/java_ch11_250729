package com.ddu.ch11.part01.stringtest;

public class ReplaceTest {

	public static void main(String[] args) {
		// 문자열의 자리 변경
		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이가 길동이보다 말을 잘합니다.";
		
		// 길동 -> 유신으로 변경
		String replaceStr =  str.replace("길동", "유신");
		// 원본 수정은 하지 않음 -> 새로운 변수로 저장
		
		System.out.println(str);
		// 길동이는 순신이보다 키가 큽니다. 하지만 순신이가 길동이보다 말을 잘합니다.
		System.out.println(replaceStr);
		// 유신이는 순신이보다 키가 큽니다. 하지만 순신이가 유신이보다 말을 잘합니다.
	}

}
