package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 중첩 for 문 5행 5열
		/*
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 5; j++) {
				int num = 5*i+j;//5는 col의 종료값
				System.out.print(num+" ");
			}
			System.out.println();
		}
		 */

		// 입장객 수에 따른 열과 줄수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer; // 입장객 수 저장
		int colNum;   // 좌석열 수 저장
		int rowNum;	  // 줄(행) 수 저장
		
		System.out.print("입장객 수 입력 : ");
		customer = sc.nextInt();
		
		
		System.out.print("좌석 열 수 입력 :");
		colNum = sc.nextInt();
		
		// 연산처리 조건문
		
		if (customer % colNum == 0) {
			rowNum = customer / colNum; // 나누는 몫
		}else {
			rowNum = (int)(customer / colNum) +1; // 나누는 몫
		}
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		
		sc.close();
		
	}

}
