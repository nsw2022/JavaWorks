package fileio.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStream {

	public static void main(String[] args) {
		String originFile = "c:/file/bg0.jpg";
		String copyFile = "c:/file/bg5.jpg";
		long start =0, end = 0;
		start = System.currentTimeMillis();
		// 보조 스트림 사용
		try (FileInputStream fis = new FileInputStream(originFile);
				FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			end = System.currentTimeMillis();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("파일 복사 소요시간: %dms",(end-start));
	}

}