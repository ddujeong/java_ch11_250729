package com.ddu.ch11.part01;

public class SystemTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
			if (i == 5000) {
				 break;
				// for 문이 종료 되고 15번 라인이 출력됨
				// System.exit(i);
				// for 문이 종료되고 프로그램 종료 15번 라인 출력 XX
			}
		}
		System.out.println("for문 종료 후 출력되는 문장");
		
		System.out.println("================================");

		long time1 = System.nanoTime(); // 현재 시간을 나노초르 변환하여 저장
		long time_m1 = System.currentTimeMillis(); // 현재 시간을 밀리초로 변환하여 저장
		long sum = 0L;
		
		for (int i = 1; i <= 10000000; i++) { //10000000번 반복되는 for 문
			sum = sum +i;
		}
		System.out.println(sum);
		
		long time2 = System.nanoTime(); // 현재 시간을 나노초르 변환하여 저장
		long time_m2 = System.currentTimeMillis(); // 현재 시간을 밀리초로 변환하여 저장
		System.out.println(time2 - time1);
		// 10000000번 반복되는 for 문을 출력하는데 걸린 나노초
		System.out.println(time_m2 - time_m1);
		// 10000000번 반복되는 for 문을 출력하는데 걸린 밀리초
		
		
		System.out.println("================================");
		
		
		
	}

}
