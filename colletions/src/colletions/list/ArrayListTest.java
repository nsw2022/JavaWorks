package colletions.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		// 부모형으로 ArrayList 객체 생성
		List<String> vegeList = new ArrayList<>();
		
		//CRUD(create, read, update, delete)
		//자료생성 - add()
		vegeList.add("양파"); // 0번 인덱스
		vegeList.add("마늘"); // 1번 인덱스
		vegeList.add("감자"); // 2번 인덱스
		
		// 개체수 - size()
		System.out.println(vegeList.size() + "개");
		
		// 1개 검색 - get()
		String str = vegeList.get(0);
		System.out.println(str);
		System.out.println();
		
		// 1개 수정 - set()
		vegeList.set(1, "고추");
		
		// 1개 삭제 - remove()
		vegeList.remove(2);
		
		// 전체검색
		for (String s : vegeList) {
			System.out.print(s+" ");
		}
		System.out.println();
		for (int i = 0; i < vegeList.size(); i++) {
			System.out.print(vegeList.get(i)+" ");
		}
		System.out.println();
		
		
		
	}

}
