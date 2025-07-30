package com.ddu.ch11.part01.stringtest.quiz;

public class Test04A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i like chopin";
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) { // 문장의 첫글자 확인
				// str.charAt(i). -> toUpperCase() 적용 안됨
				str2 = str2 + String.valueOf(str.charAt(0)).toUpperCase();
			} else if (String.valueOf(str.charAt(i)).equals(" ")) {
				str2 = str2 + str.charAt(i); // 빈칸 삽입
				str2 = str2 + String.valueOf(str.charAt(i + 1)).toUpperCase();
				i++; // 이미 다음 i값에 해당하는 문자는 대문자로 변경되어 삽입 완료  
					 // -> 다음 문자에 대한 i값은 skip
			} else {
				str2 = str2 + String.valueOf(str.charAt(i));
			}
		}System.out.println(str2);
		
		System.out.println("===================================");
		
		String strOrigin = "i like chopin";
		String strResult = "";
		
		int strFlag = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if (strFlag == 1) {
				strResult = strResult + String.valueOf(strOrigin.charAt(i)).toUpperCase();
				strFlag = 0;
			} else if (String.valueOf(strOrigin.charAt(i)).equals(" ")) {
				strResult = strResult + strOrigin.charAt(i); // 빈칸 삽입
				strFlag = 2;
			}else if(strFlag ==2) {
				strResult = strResult + String.valueOf(strOrigin.charAt(i)).toUpperCase();
				strFlag =0;
			} else {
				strResult = strResult + strOrigin.charAt(i); // 일반 소문자 글자삽입
			}
				
			}System.out.println(strResult);
		}
	}


