package colletions.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import colletions.member.Member;

//Member 관리 - Map 자료구조
public class MemberHashMap {
	Map<Integer, Member> hasMap;
	
	public MemberHashMap() {
		hasMap = new HashMap<>();
	}
	
	// 회원추가
	public void addMember(Member member) {
		hasMap.put(member.getMemberId(), member);
	}
	
	// 회원 목록 보기
	public void showAllmember() {
		Iterator<Integer> ir = hasMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hasMap.get(key);
			System.out.println(member);
		}
	}
	
	// 회원 1명 보기
	public void showOne(int memberId) {
		// containsKey 인덱스가 없기에 해당 
		// key값을 boolean으로 리턴해줌
		boolean found = false; // 상태 변수
		if (hasMap.containsKey(memberId)) {
			Member member = hasMap.get(memberId);
			System.out.println(member);
			found = true;
		}
		
		if (!found) System.out.println("해당 멤버를 찾을 수 없습니다.");
		
	}
	
	// 회원 삭제
	public void removeMember(int memberId) {
		boolean found = false; // 상태 변수
		if (hasMap.containsKey(memberId)) {
			hasMap.remove(memberId);
			found = true;
		}
		
		if (!found) System.out.println("해당 멤버를 찾을 수 없습니다.");
	}
}
