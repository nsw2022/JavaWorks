package fileio.decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStream1 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("file1.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
