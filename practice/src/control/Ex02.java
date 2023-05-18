package control;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		문제2.
		프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력
		하는 프로그램을 작성해 보자. 예를 들어 5를 입력받았다면, 3 6 9 12 15를 출력해야
		하고 3을 입력받았다면, 3 6 9 를 출력해야 한다.
		*/
		
		/*
		 * 3 6 9
		 * 1. 수입력
		 * 
		 * 2. 그 수만큼 3의 배수 반복
		 * 3 6 9 12 15
		 * 1 2 3 4  5
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			System.out.print(i*3 + " ");
		}
		
		

	}

}
