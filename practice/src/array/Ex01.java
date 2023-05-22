package array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
			문제1
			길이가 5인 int형 배열을 선언해서 프로그램 사용자로부터 총 5개의 정수를 입력 받자.
			그리고 입력이 끝나면 다음의 내용을 출력하도록 예제를 작성해보자.
			  - 입력된 정수 중에서 최대값
			  - 입력된 정수 중에서 최소값
			  - 입력된 정수의 총 합

			단, 반드시 입력을 완료한 상태에서 '최대값'과 '최소값' 그리고 '총합'을 계산해야 한다.
		 */
		
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 값 입력");
		arr[0] = sc.nextInt();
		System.out.println("2번째 값 입력");
		arr[1] = sc.nextInt();
		System.out.println("3번째 값 입력");
		arr[2] = sc.nextInt();
		System.out.println("4번째 값 입력");
		arr[3] = sc.nextInt();
		System.out.println("5번째 값 입력");
		arr[4] = sc.nextInt();
		
		int max = arr[0];
		int min = arr[0];
		int total = 0;
		
		for(int i=0; i<arr.length;i++) {
			if (min>arr[i]) min=arr[i];
			if (max<arr[i]) max = arr[i];
			total += arr[i];
		}
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
		System.out.println("총 값: "+total);
		
		sc.close();
	}

}
