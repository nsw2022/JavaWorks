package wrapper;

import java.util.ArrayList;

public class IntegerTest {
	//  MMVM  <- 디자인 패턴 
	
	//MVC == MVP 근데 P가 인터페이스로 정해놓는데요
	public static void main(String[] args) {
		
		int num1 = 100;
		
		Integer num2 = 200; // 자동형변환
		int sum;
		
		sum = num1 + num2.intValue(); // Integer -> int ( 언박싱 )
		System.out.println(sum);
		
		// 문자를 정수로 바꿔줌
		int num3 = Integer.parseInt("300");
		System.out.println(num3);
		
		// ValueOf() 정수형으로 변환
		Integer num4 = Integer.valueOf("400");
		System.out.println(num4);
		
		// 자료형으로 사용
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		System.out.println( numberList.get(0) );
		
		System.out.println();
		// 전체 요소 조회
		for (int i = 0; i < numberList.size(); i++) {
			Integer number = numberList.get(i);
			System.out.print(number + " ");
		}
		System.out.println();
		// 요소 변경
		numberList.set(1, 50);
		// 향상포문
		for (Integer i : numberList) System.out.print(i + " ");
		
		
		
			
		
		
	}
}
