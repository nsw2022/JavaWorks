package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// 10개의 기본적인 공간이 생김
		ArrayList<String> cartList = new ArrayList<>();

		// 자료 저장 - add() 함수
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("커피");

		// 특정 1개 요소 가져오기(검색) - get()
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));

		// cartList의 크기 - size()
		System.out.println(cartList.size() + "개");

		// 전체 요소 출력
		for (int i = 0; i < cartList.size(); i++) { // 리스트 순회하면서
			// String a = cartList.get(i); // 요소를 가져와서 cart 변수에 할당
			// System.out.println(a); // 출력
			System.out.println(cartList.get(i));
		}
		System.out.println("=========================================");
		// 요소 수정
		cartList.set(0, "라면");

		// 요소 삭제 - remove()
//		cartList.remove("콩나물");
//		cartList.remove(1);
		// contains - 객체 안에 값이 있는지 값을 true/false로 리턴함
//		System.out.println( cartList.contains("생수") );
		if (cartList.contains("콩나물"))
			cartList.remove("콩나물");
		// 향상된 for문
		for (String cart : cartList)
			System.out.println(cart);

	}

}
