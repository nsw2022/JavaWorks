package methods;

public class OneUp {
	
	// 숫자 1증가 함수
	public static int oneUp() {
		// x는 값을 반환한후에 소멸
		int x = 0;
		x++;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp()); // 1
		System.out.println(oneUp()); // 1
		System.out.println(oneUp()); // 1
		System.out.println(oneUp()); // 1
		System.out.println(oneUp()); // 1
		System.out.println(oneUp()); // 1
		
		//x 값 확인
		//	System.out.println(x); // x는 변수 할당하지 않아서 컴파일 오류
		
		
		
	}

}
