package control;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 문제1.
		// 프로그램 사용자로부터 양의 정수를 하나 입력 받아서, 그 수만큼 "Hello World!"를
		// 출력하는 프로그램을 작성해보자.
		System.out.println("정수 입력한 만큼 안녕 세상아 반복");
		Scanner sc = new Scanner(System.in);
		try {
			int input = sc.nextInt();
			for (int i = 0; i < input; i++) {
				System.out.println("Hello World");
			}
		}
		catch (Exception e) {
			System.out.println("정수값 입력안함 프로그램 종료");
		}

	}

}
