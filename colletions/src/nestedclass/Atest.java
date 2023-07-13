package nestedclass;

public class Atest {
	public static void main(String[] args) {
		A a = new A();
		
		// B 객체 생성
		A.B b = a.new B();
		b.field1=10;
		b.method();
		
		// 정적 내부 클래스 객체 생성
		A.C c = new A.C();
		c.method1();
		//c.field2 정적은 직접 접근
		A.C.field2 = 4;
		A.C.method2();
		
		// D객체 생성
		a.method();
	}
}

