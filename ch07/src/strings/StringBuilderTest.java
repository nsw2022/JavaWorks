package strings;

public class StringBuilderTest {
	public static void main(String[] args) {

		/*
		 * String은 짧은 문자열을 더할 경우 사용합니다.
		 * 
		 * 그럼 두 클래스의 차이점은 무엇일까요? 바로 동기화 여부입니다.
		 * 
		 * StringBuffer는 각 메서드별로 Synchronized Keyword가 존재하여, 멀티스레드 환경에서도 동기화를 지원. 
		 * 반면, StringBuilder는 동기화를 보장하지 않음.
		 * 
		 * StringBuffer는 스레드에 안전한 프로그램이 필요할 때나, 개발 중인 시스템의 부분이 스레드에 안전한지 모를 경우 사용하면
		 * 좋습니다.
		 * 
		 * StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 프로그램을 개발할 때 사용하면 좋습니다.
		 * 
		 * 단순히 성능만 놓고 본다면 연산이 많은 경우, StringBuilder > StringBuffer >>> String 입니다.
		 * 
		 */

		String javaStr = new String("java");

		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));

		StringBuilder builder = new StringBuilder(javaStr);
		System.out.println("연산전 주소값: " + System.identityHashCode(builder));

		// 문자열 연결
		builder.append(" and ");
		builder.append("android ");
		System.out.println("연산후 주소값: " + System.identityHashCode(builder));

		System.out.println(builder);
		System.out.println(builder.toString());

	}
}
