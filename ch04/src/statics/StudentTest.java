package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생객체생성 lee - 힙메모리에 위치
		Student lee = new Student();
		
		// lee.name = "이대한"; // private이 붙은 변수는 접근할 수가 없다.
		lee.setName("이대한");
		lee.setStdId(1001);
		
		System.out.println("이름: "+lee.getName());
		System.out.println("학번: "+lee.getStdId());
		
	}

}
