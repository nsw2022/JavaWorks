package colletions.list;

import colletions.member.Member;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		MemberArrayList meberList = new MemberArrayList();
		
		// Member 객체 생성
		Member m1 = new Member(101, "이순신");
		Member m2 = new Member(102, "안산");
		Member m3 = new Member(103, "추신수");
		Member m4 = new Member(102, "김연아");
		
		// 회원을 추가
		meberList.addMember(m1);
		meberList.addMember(m2);
		meberList.addMember(m3);
		meberList.addMember(m4);
		
		System.out.println(m1+"\n");
		meberList.showAllMember();
		System.out.println();
		// 회원 1명 조회
		meberList.showOne(102);
		meberList.removeMember(102);
		System.out.println();
		meberList.showAllMember();
	}

}
