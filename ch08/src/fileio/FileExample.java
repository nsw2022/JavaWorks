package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/file/newfile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());// 디렉토리아님
		System.out.println(file.getName());// 이름가져옴 확장자까지
		System.out.println(file.getPath());// 경로가져옴
		System.out.println(file.length()+"B");// 파일용량 바이트 단위로 알려줌
		
		
		
		//System.out.println("파일생성");
		
	}
}
