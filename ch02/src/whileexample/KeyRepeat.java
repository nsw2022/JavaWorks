package whileexample;

import java.util.Scanner;

public class KeyRepeat {
	public static void main(String[] args) {
		// y 키 누르면 계속반복 n 누르면 멈춤
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요(y/n)");
		while (true) {
			
			String key = sc.nextLine();
			
			if(key.equals("y")) {
				System.out.println("계속 반복");
				System.out.println("키를 입력하세요(y/n)");
				System.out.println();
				
			}else if(key.equals("n")) {
				System.out.println("반복 중단");
				break;
				
			}else {
				System.out.println("지원하지 않는 키입니다.");
				System.out.println("키를 입력하세요(y/n)");
				System.out.println();
				
			}
			
		}//while
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
