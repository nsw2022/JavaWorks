package test_book;

public class TestString {

	public static void main(String[] args) {
		// 기본자료형 - 8가지
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		// 참조자료형 앞에가 대문자!!
		String s1 = "하이";
		String s2 = new String("하이");
		
		Person p1 = new Person("승우");
		Person p2 = new Person("승우");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (s1.equals(s2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
		
		
		
	}
	


}

class Person{
	String name;
	public Person(String name) {
		this.name=name;
		
	}
}
