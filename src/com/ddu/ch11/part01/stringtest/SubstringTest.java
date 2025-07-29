package com.ddu.ch11.part01.stringtest;

public class SubstringTest {

	public static void main(String[] args) {
		// 원하는 인덱스 넘버 ~ 넘버 까지 추출 
		String addr = "서울특별시 종로구 숭인동 111번지 306호 2층";
		
		String firstAddrStr = addr.substring(6, 9);
		// endindex 에 해당하는 문자는 포함안됨 (+1) 
		System.out.println(firstAddrStr);
		// 종로구

		// 원하는 인덱스 넘버 부터 끝까지 추출
		String secondAddr = addr.substring(14);
		System.out.println(secondAddr);
		// 111번지 306호 2층
	}

}
