package test_book;

public class TestString {

	public static void main(String[] args) {
		String a = "a";
		String a1 = new String("a");
		if (a.equals(a1)) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다!");
		}
		
		System.out.println(a1);
		System.out.println(a1.toString());
		
		
		
	}

}
