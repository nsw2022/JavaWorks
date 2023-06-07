package strings;

public class StringIndexOf {
	public static void main(String[] args) {
		// indexOf -- 찾는 문자의 첫 위치가 반환됨
		String subject = "자바 프로그램";
		int location = subject.indexOf("");
		System.out.println(location);
		
		if (location >= 0) {
			System.out.println("자바와 관련된 책이군요! ");
		}else {
			System.out.println("자바와 관련 없는 책이군요! ");
		}
		
		
	}
}
