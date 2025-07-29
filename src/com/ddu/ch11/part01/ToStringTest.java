package com.ddu.ch11.part01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob =  new Object();
		System.out.println(ob.toString());
		// java.lang.Object@224aed64
		// @16진수 해시코드
		
		//Member member = new Member(); -> (오버라이딩 후)null
		Member member = new Member("tiger"); // -> tiger
		System.out.println(member.toString());
		// com.ddu.ch11.part01.Member@1c53fd30
		// -> (오버라이딩 후)tiger
		System.out.println(member.id); // -> tiger
	

		Date date = new Date();
		System.out.println(date.toString());
		// Tue Jul 29 11:11:52 KST 2025
		// 현재 시간 출력


	
	}

}
