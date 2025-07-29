package com.ddu.ch11.part01;


public class MathTest {

	public static void main(String[] args) {
		// Math 클래스
		
		
		System.out.println(Math.abs(-10));
		// 절대값 -> 10
		System.out.println(Math.ceil(3.14));
		// 소수점 올림값 -> 4.0
		System.out.println(Math.floor(3.94));
		// 소수점 내림값 -> 3.0
		System.out.println(Math.round(3.5));
		// 소수점 반올림값 -> 4
		System.out.println(Math.max(5, 10));
		// 둘 중의 최고값 -> 10
		System.out.println(Math.min(1.1, 10.1));
		// 둘 중의 최솟값 -> 1.1
		System.out.println(Math.random());
		// 0 ~ 1 사이의 숫자 중 랜덤으로 1개 반환
		System.out.println(Math.random()*45 + 1);
		// 1 ~ 45 사이의 숫자 중 랜덤으로 1개 반환
		System.out.println(Math.floor(Math.random()*45 + 1));
		// 1 ~ 45 사이의 숫자 중 랜덤으로 1개 소수점 내림값으로 반환
		System.out.println(Math.rint(-3.7));
		// 인수값에 가장 가까운 정수를 실수형으로 변환 -> - 4.0
	}

}
