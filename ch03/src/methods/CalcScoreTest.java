package methods;

import java.util.Scanner;

public class CalcScoreTest {

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
                    for (int i = 0; i < scores.length; i++) {
                    	// System.out.println(i);
                        System.out.print("scores[" + i + "] (z 입력 시 이전 메뉴로)(x는 입력 초기화): ");
                        String input = sc.nextLine();
//                        if (scores[i] <= 100 && scores[i] >= 0) {
//							
//						}
                        if (input.equalsIgnoreCase("z")) {
                           i--;
                           i--;
                           continue;// 이전 메뉴로 돌아가기
                        }else if(input.equalsIgnoreCase("x")) {
                        	i=-1;// 반복문 처음으로 돌아가는 알고리즘 
                        		 // 다음 i가 +1이 되기때문에 0으로 바뀌며 맨처음으로 돌아감
                        	continue;
                        }
                        scores[i] = Integer.parseInt(input);
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
