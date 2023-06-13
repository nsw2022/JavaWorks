package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {
	public static void main(String[] args) {
		// 이미지 파일을 읽고쓰기(복사)
		String originFile = "c:/file/ojdbc8.jar";
		String copyFile = "c:/file/ojdbc8-1.jar";
		long start =0,end = 0;

		try (FileOutputStream fos = new FileOutputStream(copyFile);
				FileInputStream fis = new FileInputStream(originFile);
		) {
			start = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.printf("파일 복사 소요시간 "+((double)(end-start)/1000)+"초");

	}// main
}
