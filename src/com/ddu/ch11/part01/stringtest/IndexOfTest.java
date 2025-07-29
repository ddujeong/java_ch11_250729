package com.ddu.ch11.part01.stringtest;

public class IndexOfTest {

	public static void main(String[] args) {
		// 포함하고 있는 문자의 인덱스 시작 넘버
		// 특정 문자열이 포함되어있는지 확인할 수 있음
		String str = "대한민국 일본 ";
		
		int index = str.indexOf("일본");
		System.out.println(index);
		
		if (str.indexOf("민국") != -1){ // 일치되는 문자열을 찾지 못하면 -1이 반환
			System.out.println("민국이 포함되어 있습니다.");
		} else {
			System.out.println("민국이 포함되어 있지 않습니다.");
		} // 참을 찾고자 할때는 != 사용하는것이 적합

		System.out.println(str.length());
		// 8 (공백 2개 포함)
		// {대,한,민,국,null,일,본,null}
	}

}
