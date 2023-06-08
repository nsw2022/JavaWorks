package systems;

public class SystemEx {
	public static void main(String[] args) {
		
		// System.exit(0) - 0은 정상 종료를 의미 0을 제외한 값은 비정상종료
		for (int i = 0; i <= 10; i++) {
			if (i==5) System.exit(0); // <- main함수를 종료시켜버림 break랑 다름
			// break,return <- 구조체,실행문 종료
			System.out.println(i);
		}
		System.out.println("반복종료");
	}
}
