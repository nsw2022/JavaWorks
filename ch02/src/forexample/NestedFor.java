package forexample;

public class NestedFor {
	public static void main(String[] args) {
		// 중첩 for 문 5행 5열
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();

		// 별찍기
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		// 역 삼각형 감소연산자
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 중첩 for 문 5행 5열
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 5; j++) {
				int num = 5*i+j;//5는 col의 종료값
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
