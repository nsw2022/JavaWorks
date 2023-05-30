package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		// Person 자료 검색(목록 조회)
		PersonDAO dao = new PersonDAO();
		
		
		// 자료 삽입
//		Person person1 = new Person("test","test1234","테스터",30);
//		dao.insertPerson(person1);
		
		// 자료 하나 검색
//		Person person = dao.getPerson("cloud");
//		String userId=person.getUserId();
//		String userpw=person.getUserPw();
//		String name=person.getName();
//		int age=person.getAge();
//		
//		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n"
//				,userId,userpw,name,age);
//		
//		dao.delectPerson("test");
		
		// 자료 수정 아이디 'today'인 사람 수정
		Person cloud = dao.getPerson("clould");
		// 변경 자료 입력
		cloud.setName("클라우드");
		cloud.setAge(50);

		dao.updatePerson(cloud);
		System.out.println("================================================");
		
		// 전체 목록 검색
		ArrayList<Person> personList = dao.getPersonList();
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);  // 어레이 리스트의 요소를 가져와서
			
			String userId = person.getUserId();
			String userpw = person.getUserPw();
			String name = person.getName();
			int age = person.getAge();
			
			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n"
					,userId,userpw,name,age);
		
		}
		
	}

}
