package forexample;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		int sumV = 0; //합게 변수

		for(int i=1; i<=10; i++) {
			sumV += i;
			System.out.println("i= " + i + " sumV=" + sumV);	
		}
		System.out.println("합계: " + sumV);

		// 문자 세트
		char ch;
		for (ch = 65; ch < 123; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		//유니코드 - 한글
		for (ch = 12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		System.out.println();

		// 구구단
		Scanner sc = new Scanner(System.in);
		System.out.println("보고싶은 단을 입력해주세요 문자열입력하면 3대가 대머리");
		int dan = sc.nextInt();
		for (int j = 1; j < 10; j++) {
			System.out.println(dan + " X " + j + " = " + dan * j);
		}
		
		sc.close();
	}

}
