package statics;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학번 자동 부여
		Student kim = new Student();
		Student han = new Student();
		Student kang = new Student();
		
		
		System.out.println("학번: "+kim.getStdId());
		System.out.println("학번: "+han.getStdId());
		System.out.println("학번: "+kang.getStdId());
		
	}

}
