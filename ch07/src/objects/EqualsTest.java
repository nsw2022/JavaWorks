package objects;

public class EqualsTest {
	public static void main(String[] args) {
		String name1 = new String("오상식");
		String name2 = new String("오상식");
		String neme3 = new String("노승우");
		
		// 객체의 메모리 주소 비교
		System.out.println(name1==name2); // false
		// 객체의 값을 비교(문자열)
		System.out.println(name1.equals(name2)); // true
		
		System.out.println("===========================");
		Book book1 = new Book(1, "혼공자바");
		Book book2 = new Book(1, "혼공자바");
		
		System.out.println(book1==book2);
		System.out.println(book1.equals(book2));
		//	System.out.println(book1.toString().equals(book2.toString()));
		
		// hashcode 테스트 자바에서의 주소값 - 객체가 같은 객체인지 확인하려 하는것
		System.out.println();
		System.out.println(name1.hashCode());//50325344
		System.out.println(name2.hashCode());//50325344
		System.out.println(neme3.hashCode());//45256335
		
		System.out.println(book1.hashCode());//2083562754
		System.out.println(book2.hashCode());//1239731077
		
	}
}
