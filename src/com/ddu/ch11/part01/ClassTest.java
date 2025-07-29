package com.ddu.ch11.part01;

public class ClassTest {

	public static void main(String[] args) {
		Class cla = Car.class;
		System.out.println(cla.getName()); //  패키지와 클래스 네임
		// com.ddu.ch11.part01.Car
		System.out.println(cla.getSimpleName()); // 클래스 네임
		// Car
		System.out.println(cla.getPackageName()); // 패키지 네임
		// com.ddu.ch11.part01
	}

}
