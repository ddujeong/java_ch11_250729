package com.ddu.ch11.part01.stringtest;

public class CharAtTest01 {

	public static void main(String[] args) {
		// String 배열의 인덱스 번호값의 1글자만 반환해줌
		String str = "Korea"; // {0,1,2,3,4}
		
		System.out.println(str.charAt(0)); // K
		
		int count = 0;
		for (int i = 0; i <str.length(); i++) {
			// System.out.println(str.charAt(i));
			// K o r e a
			if (str.charAt(i) == 'o') {
				System.out.println("문자열 내에 소문자 'o'가 포함되어 있습니다");
				count++;
			}
		} System.out.println(str + "문자열 내에 소문자 'o'가 " + count + "번 포함 되어있습니다.");
	}

}
