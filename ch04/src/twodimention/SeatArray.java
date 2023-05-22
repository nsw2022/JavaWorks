package twodimention;

import java.util.Scanner;

public class SeatArray {
	public static void main(String[] args) {
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
			rowNum = (int)(customer / colNum) + 1; // 나누는 몫
		}
		
		// 자리배치 배열 공간 생성
		int [][] arr = new int[rowNum][colNum];
		
		for (int i = 0; i < rowNum; i++) {
			for (int j = 1; j <= colNum; j++) {
				int num = colNum*i+j;//5는 col의 종료값
				if (customer<num) break;
				System.out.printf(" 좌석%2d",num);
			}
			System.out.println();
		}
		sc.close();
	}
}
