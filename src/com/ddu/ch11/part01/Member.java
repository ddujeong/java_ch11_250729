package com.ddu.ch11.part01;

public class Member { //DTO
	public String id;

	public Member() {
	}

	public Member(String id) {
		this.id = id;
	}
	// 객체를 인수로 받아서 그 객체와 Member 클래스로 만든 객체인지 확인하여 맞으면
	// member 객체로 다운 캐스팅 하여 그 안에 있는 id 필드를 꺼내서
	// 본인 객체가 가지고 있는 id 값과 비교하며 같으면 true, 아니면 false 를 출력하는 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // 다운캐스팅
			if (id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id;
	}
	
	
	
	
}
