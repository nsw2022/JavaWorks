package classpart;

public class StudnetTest {

	public static void main(String[] args) {
		// Student 클래스 사용
		Studnet s1 = new Studnet();
		System.out.println(s1);
		
		s1.studentID = 100;
		s1.studentName = "강하늘";
		
		// 출력
		s1.showInfo();
		//	System.out.println(s1.studentID);
		//	System.out.println(s1.studentName);
		
		
		
	}

}
