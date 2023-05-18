package methods;

class MethodEx{
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	// 두 수를 더하는 함수
	public int add(int x, int y) { return x+y; } 
	
	// 이름이 매개변수인 sayHello()함수 작성
	public void sayHello(String name) {
		System.out.println(name+"님 환영합니다.");
	}
}
public class MethodTest {
	public static void main(String[] args) {
		// sayHello() 사용 (호출), 객체이름 . 함수이름()
		MethodEx method = new MethodEx();
		method.sayHello();
		int value = method.add(10, 20);
		System.out.println(value);
		method.sayHello("노승우");
		
	}

}
