package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {
	public static void main(String[] args) {
		//이미지 파일을 읽고쓰기(복사)
		String originFile = "c:/file/bg0.jpg";
		String copyFile = "c:/file/bg1.jpg";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			int i;
			while ((i=fis.read()) != -1) {// 이미지 파일 읽어서
				fos.write(i);// 이미지파일 복사
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//finally
		
				
	}//main
}
