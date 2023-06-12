package fileio.reader;

import java.io.FileReader;

public class ReaderTest3 {
	public static void main(String[] args)  {
		// close를 하지 않는 문법
		// try ~ with ~ resource
		try (FileReader fr = new FileReader("data2.txt")){
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			
		}
		
		
	}

}
