package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("data2.txt");

		int data;
		/* 방법1
		while (true) {
			data = fr.read();
			if (data == -1) break;
			System.out.print((char) data);
		}
		*/
		
		/* 방법2
		while ((data = fr.read()) != -1)
			System.out.print((char) data);
		*/
		fr.close();

	}

}
