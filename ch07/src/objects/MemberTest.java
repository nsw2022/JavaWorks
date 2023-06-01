package objects;

public class MemberTest {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		
		if (obj1.equals(obj2)) {
			System.out.println("둘이 일치");
		}else {
			System.out.println("둘이 다름");
		}

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
