package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double RATE_KPH_MPH = 1.690344; //변환상수
		double kph = 0.0;
		double mph = 0.0;
		
		System.out.print("당신의 구속을 입력하세요(km/h) : ");
		kph = scan.nextDouble();
		
		//mile = km / 변환상수
		mph = kph / RATE_KPH_MPH;
		
		// printf("문자열 포맷", 객체)
		System.out.printf("공의 속도는 %.2f[MPH]입니다",mph);
		scan.close();
	}

}
