package classpart;

// public - 접근 제어자
public class Studnet {
	// 클래스 3요소 - 멤버변수, 생성자, 메서드
	// 생성자(Constructor)는 반환형이 없고, 클래스 이름과 동일하다
	// 생서자 오버로딩(이름은 같고, 매개변수의 갯수와 자료형은 다름)
	int studentID; // 학번
	String studentName;
	
	public Studnet() {} // 기본 생성자
	
	// 매개변수가 있는 생성자
	public Studnet(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID 
				+ ", 이름: " + studentName);
	}
	
}
