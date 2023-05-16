package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수/짝수를 판별하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			String input2 = "";
//			String input2 = (input % 2 == 0) ? "짝수" : "홀수";
			if (input % 2 == 0) {
				input2 = "짝수";
			}else {
				input2 = "홀수";
			}
			System.out.println(input2);

			sc.close();


		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요");

		}
	}
}
