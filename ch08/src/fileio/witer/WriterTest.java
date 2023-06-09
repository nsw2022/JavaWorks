package fileio.witer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("data.txt");
		
		fw.write("hello~\n");
		fw.write("한글을 받아라\n");
		fw.write(66); // 정수는 아수키 코드값으로 인지
		fw.write(66+1);
		//fw.write(2.54); 실수 사용 불가
		
		char[] buf = {'s','m','i','l','e'};
		fw.write(buf);
		fw.write(10);// 줄바꿈 개행문자
		fw.write(buf, 1, 4);
		
		
		fw.close();
		
		
		
		
		System.out.println("수.행.완.료 크킄");
		
		
		
		
		
	}
	
}
