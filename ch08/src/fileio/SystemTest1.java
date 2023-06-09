package fileio;

import java.io.IOException;

public class SystemTest1 {
	public static void main(String[] args) {
		System.out.println("한 문자를 입력하고 [Enter]를 누르세요");
		
		try {
			int readBite = System.in.read();
			System.out.println(readBite); // 아스키 코드값
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
