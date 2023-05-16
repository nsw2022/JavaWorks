package operator;

public class Operator2 {

	public static void main(String[] args) {
		// 비교 연산 >, <, ==, !=
		int num1 = 7, num2 = 3;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println();
		
		// 논리 연산
		/*
		 * && 논리곱 (비교대상이 모두 true면 true)
		 * || 논리합(비교대상이 하나만 true면 true)
		 * !  논리 부정(비교대상이 true면 false)
		 * 
		 * */
		
		System.out.println((num1 < num2) && (num1 != num2 )); // false
		System.out.println((num1 < num2) || (num1 != num2 )); // true
		System.out.println( !(num1 != num2 )); // false
		
	}

}
