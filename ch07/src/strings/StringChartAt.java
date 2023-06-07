package strings;

public class StringChartAt {
	public static void main(String[] args) {
		// 문자열 함수 - charAt(인덱스) : 그 위치의 문자 변환(리턴) 
		String subject = "자바프로그램";
		char charValue = subject.charAt(0);
		System.out.println(charValue);
		
		// 주민 번호에서 남여 구분
		String ssn = "940815-2234567";
		char gender = ssn.charAt(7);//'-'
		switch (gender) {
		case '1': case '3': case '5':
			System.out.println("남자입니다"); break;
		case '2': case '4': case '6':
			System.out.println("여자입니다."); break;
		default:
			System.out.println("지구인이 아니군 킷사마"); break;
		}
		
	}
}
