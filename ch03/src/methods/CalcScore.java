package methods;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true; // 상태변수
		int[] scores = null;// 배열 초기화

		while (run) {
			try {
				System.out.println("---------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("---------------------------------------------");
				System.out.print("선택>");

				int selectNo = Integer.parseInt(sc.nextLine());
				
				if (scores != null && scores[0] == -1) {
					// scores != null <- 값의 자리수를 입력한순간 0으로 배열들이 자동 초기화
					// 고로 추가 조건문 and를 올리가없는값으로 초기화 하여 제어함
					System.out.println("1번부터 입력해주세요");
				}
				
				if (selectNo == 1) {
					System.out.print("학생수>");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores=new int[studentNum];
				}else if (selectNo == 2) {
					
					for(int i=0; i<scores.length;i++) {
						System.out.print("scores["+i+"]>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
					
				}else if (selectNo == 3) {
					
					for(int i=0; i<scores.length;i++) {
						System.out.println("scores["+i+"]>"+scores[i]);
					}
					
				}else if (selectNo==4) {
					// 분석 - 합계, 평균, 최고점수
					int sumV=0;
					double avg = 0;
					int max=0;
					for (int i = 0; i < scores.length; i++) {
						sumV += scores[i];
						if (max < scores[i]) {
							max=scores[i];
						}
					}
					avg = (double)sumV / scores.length;
					System.out.println("총점  : " + sumV);
					System.out.println("평균  : " + avg);
					System.out.println("최댓값 : " + max);
					
				}else if(selectNo==5){
					
					run=false;
					System.out.println("프로그램을 종료합니다");
					
				}else {
					
				}
			}//try
			catch (Exception e) {
				
				System.out.println("1번을 먼저 입력해주세요");
			}//catch

		}// while

		sc.close();


	}// main


}
