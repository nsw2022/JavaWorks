package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// 구현클래스생성
		MyClass myClass = new MyClass();
		
		// 부모형으로 객체 할당
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		System.out.println("******************************");
		
		//MyInterface형으로 객체 생성
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}

}
