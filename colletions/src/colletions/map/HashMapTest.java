package colletions.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		// Map 객체의 생성 - 학생의 성적을 관리(CRUD)
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 생성(저장)
		map.put("이순신", 90);
		map.put("홍길동", 80);
		map.put("홍길동", 80);
		map.put("강감찬", 70);
		
		System.out.println("총 개수 " + map.size());
		
		// 객체 삭제
		if (map.containsKey("이순신")) map.remove("이순신");
		
		// 객체 1개 조회(점수) - get()
		System.out.println(map.get("강감찬"));
		
		// "강감찬"의 점수를 100점으로 변경
		map.put("강감찬", 100);
		
		
		// 전체 목록 조회 - Set, Iterator 자료형 사용
		Set<String> keySet = map.keySet(); // 중복이 안되는 자료로 저장
		System.out.println(keySet);
		Iterator<String> ir = keySet.iterator(); // 1개씩 순회함
		while (ir.hasNext()) {
			String key = ir.next(); // 다음 자료
			Integer value = map.get(key); // key를 매개로 값을 가져옴
			System.out.println(key + ", " + value);
			
		}
		
		
	}

}
