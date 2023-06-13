package fileio.decorator;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {

	public static void main(String[] args) {
		// 문자열 읽어오기 - 보조 스트림 사용
		try (FileReader fr = new FileReader("msg.txt");
				BufferedReader br = new BufferedReader(fr);){
			String line = null;
			while (true) {
				line = br.readLine(); // 한 줄 읽은 데이터 저
				if (line == null) break; // 읽은 데이터가 null 이면 출력
				System.out.println(line);
				
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
