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
		
		//lastIndexOf() - 찾는 문자를 뒤에서 부터 검색함
		String uri = "/board/boardList.jsp";
		int uri_idx1 = uri.indexOf('/');
		System.out.println(uri_idx1);//0
		
		int uri_idx2 = uri.lastIndexOf('/');//6 뒤에서 부터 찾음
		System.out.println(uri_idx2);
		
		
		
		
	}
}
