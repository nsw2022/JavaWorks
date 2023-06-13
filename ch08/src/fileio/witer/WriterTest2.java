package fileio.witer;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest2 {
	public static void main(String[] args) {
		
		// 문자열 파일 쓰기
		FileWriter fw = null;
		try {
			fw = new FileWriter("msg.txt");
			fw.write("goodLuck\n");
			fw.write("코로나 주의\n");
			fw.write("오늘따라너무힘들군요\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("수행완료");
		
		
		
		
		
	}
	
}
