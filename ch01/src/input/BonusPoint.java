package input;

import java.util.Scanner;

public class BonusPoint{
	public static void main(String[] args) {
		// 고객의 구매 포인트 계산 프로그램
		// 보너스 포인트 = 구매금액 x 보너스 적립률
		Scanner sc = new Scanner(System.in);
		
		// 고객 이름 입력
		System.out.print("이름을 입력하세요 ");
		String name = sc.nextLine();
		
		System.out.printf("당신의 이름은 %s \n",name);
		
		System.out.print("구매 금액을 입력하세요");
		
		int price = sc.nextInt();
		int bonusPoint;
		double bonusRatio = 0.05;
		
		// int 형 < double 형
		bonusPoint = (int) (price * bonusRatio);
		
		System.out.printf("보너스 포인트는 %d점입니다.",bonusPoint);
		
		sc.close();
		
		
	}
}
