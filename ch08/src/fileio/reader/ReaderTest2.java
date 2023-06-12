package fileio.reader;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest2 {
	public static void main(String[] args)  {
		

		Reader fr = null;
		int data;
		
		try {
			fr = new FileReader("data2.txt");
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
	
		
	}

}
