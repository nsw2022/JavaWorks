package exception;

public class ThrowsException {
	
	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		// throws - 예외처리 ( 사용하는 쪽에서 try~catch )
//		Class.forName("java.lang.String");
		Class.forName("java.util.ArrayList2");
		
	}

}
