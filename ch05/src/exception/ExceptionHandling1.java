package exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		try {
			int[] num = new int[2];
			num[0]=1;
			num[1]=1;
			num[2]=1;
			
			System.out.println(num[2]);
		} catch (Exception e) {
			System.out.println("범위를 벗어놨소!!");
		}
		
	}

}
