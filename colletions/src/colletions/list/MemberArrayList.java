package colletions.list;

import java.util.ArrayList;

import colletions.member.Member;

// Member 클래스를 관리하는 클래스(CRUD)
public class MemberArrayList {

	ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	// 회원 생성 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 회원 전체 보기
	public void showAllMember() {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}

	// 회원 1명 보기
	public void showOne(int memberId) {
		boolean found = false; // 상태 변수
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				System.out.println(member);
				found = true;
			}
		}

		if (!found) {
			System.out.println("해당 멤버를 찾을 수 없습니다.");
		}
	}
	
	// 회원삭제
	public void removeMember(int memberId) {
		boolean found = false; // 상태 변수
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				arrayList.remove(member);
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("해당 멤버를 찾을 수 없습니다.");
		}
	}
}
