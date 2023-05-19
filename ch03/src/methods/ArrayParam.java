package methods;

public class ArrayParam {

	public static void main(String[] args) {
		// 더하기 기능 함수 호출
		//	ArrayParam ap = new ArrayParam(); // ap - 힙 메모리 공간
		
		
		int val = add(4, 5);
		System.out.println(val);
		
		int[] num = {1,2,3,4};
		System.out.println(add(num));
		
		// add2(num)
		int [] result = add2(4, 2, num);
		for (int i = 0; i < result.length; i++) {
			System.out.printf(result[i]+ " ");
		}
		
		
//		test("테"+"스"+"트");
//		test();
//		test(new String[2]);
	}
	
	
	// 더하기 기능이 있는 함수 - 매개변수로 변수 활용
	// static을 붙히는 이유 - (new로 객체를 생성하지 않음) - 정적 메모리 영역
	public static int add(int x, int y) {	
		return x + y;
	}
	
	// 매개변수로 배열을 사용 - 매개변수로 배열 활용
	public static int add(int value[]) {
		int arrSum = 0;
		for (int i = 0; i < value.length; i++) { arrSum += value[i]; }
			
		return arrSum;
	}
	
	public static int[] add2(int range,int input,int value[]) {
		int[] value2 = new int[range];
		for (int i = 0; i < value.length; i++) 
			{ value2[i] = value[i] * input; }
		return value2;

	}
	
	
//	public static void test(String ...name) {
//		for (String a : name) {
//			System.out.println(a);
//		}
//		
//	}

}
