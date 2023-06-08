package strings;

public class StringSubString {

	public static void main(String[] args) {
		
		//substring(인수1, 인수2) - 인수1에서 시작해서 인수2에 입력된만큼 추출
		String ssn = "980303-1234567";
		
		String firstPart = ssn.substring(0, 6);
		//System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);
		//System.out.println(secondPart);
		
		// url 경로 추출
		String uri = "/board/boardList.jsp";
		int uri_idx = uri.lastIndexOf('/');
		System.out.println(uri.substring(uri_idx));
		
		
	}// main

}
