package colletions.list;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// Vector - 멀티 스레드 환경에서 사용함
		List<String> vegeList = new Vector<>();
		
		// 객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		// 특정
		vegeList.add(2,"고추");
		

		for (int i = 0; i < vegeList.size(); i++) {
			System.out.println(vegeList.get(i));
		}
	}

}
