package chapter04;



public class Test4_2 {

	public static void main(String[] args) {
		// 2번
//		int result=0;
//		for (int i = 1; i <= 100; i++) {
//			if (i%3==0) {
//				result += i;
//			}
//		}
//		System.out.println(result);
		
		// 3번
		// 랜덤 주사위 2개
		// 랜덤 주사위 2개
//		int rnd1 = (int)(Math.random()*6)+1;
//		int rnd2 = (int)(Math.random()*6)+1;
//		while (rnd1 + rnd2 != 5) {
//		    System.out.println("둘이 합이 5가 아닙니다~~");
//		    System.out.println("랜덤1값: " + rnd1 + " 랜덤2값: " + rnd2);
//		    rnd1 = (int)(Math.random()*6)+1;
//		    rnd2 = (int)(Math.random()*6)+1;
//		}
//		System.out.println();
//		System.out.println("둘이 합이 5입니다~~");
//		System.out.println("랜덤1값: " + rnd1 + " 랜덤2값: " + rnd2);

//		// 4번
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if ((4 * x + 5 * y) == 60) {
//					System.out.println("(" + x + ")" + ", " + "(" + y + ")");
//				}
//			}
//		}

		// 5번
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		// 6번
		// 방법1
//		for (int i = 1; i < 5; i++) {
//			for (int j = 4; j > 0; j--) {
//				if (i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}

		// 방법2
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 4-i; j++) { // 공백이 증가하고
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*"); // 별증가
//			}
//			System.out.println();
//		}

	}

}
