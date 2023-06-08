package strings;

public class StringTest {
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String android = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값" + System.identityHashCode(javaStr));
		
		System.out.println(android);
		System.out.println("처음 문자열 주소값" + System.identityHashCode(android));

		//문자열 연결 - concat()사용 -> 메모리 주소가 처음과 바뀜
		javaStr = javaStr.concat(android);
		System.out.println(javaStr);
		System.out.println("연산 후 주소값" + System.identityHashCode(javaStr));
		
		
	}
}

