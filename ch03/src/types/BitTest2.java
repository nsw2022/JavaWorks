package types;



public class BitTest2 {

	public static void main(String[] args) {
		// 비트 논리 연산자
		int num1 = 5;
		int num2 = 10;
		int result1;
		int result2;
		
		result1 = num1 & num2; // 비트 논리곱(둘다 1일때만 1)
		result2 = num1 | num2; // 비트 논리합(둘 중 하나만 1이어도 1임)
		
		// 비트 연산
		System.out.println(result1 ); // 00000000 -> 0
		System.out.println(result2 ); // 00001111 -> 15
		
		// 비트 이동(shift) 연산자
		// << - 왼쪽 시프트, >> - 오른쪽 시프트
		// 0000101 <<2 ----> 0010100
		// 0000101 >>2 ----> 0000001
		
		int val = 2;
		System.out.println(val << 1); // 0000100 - 4
		System.out.println(val << 2); // 0001000 - 8
		System.out.println(val >> 1); // 0000001 - 1
		System.out.println(val >> 2); // 0000000 - 0
	}

}
