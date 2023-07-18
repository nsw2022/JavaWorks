package colletions.map;

import colletions.member.Member;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		MemberHashMap memberMap = new MemberHashMap();
		
		// 회원생성
		memberMap.addMember(new Member(101, "이순신"));
		memberMap.addMember(new Member(102, "안산"));
		memberMap.addMember(new Member(102, "김연아"));
		memberMap.addMember(new Member(103, "추신수"));
		
		
		//memberMap.showAllmember();
		
		//memberMap.showOne(104);
		memberMap.removeMember(102);
		memberMap.showAllmember();
		
	}
	
}
