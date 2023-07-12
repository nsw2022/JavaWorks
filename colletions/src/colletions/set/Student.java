package colletions.set;

public class Student {
	String name;
	int age;
	
	// 생성자
	public Student(String name) {
		this.name = name;
		
	}

	//hashCode() 오버라이드
	@Override
	public int hashCode() {//hashCode()->십진수로 출력
		// TODO Auto-generated method stub
		return name.hashCode();//->문자로 반환
	}

	@Override
	public boolean equals(Object obj) { // 객체인지 확인 명령어 instanceof
		if (obj instanceof Student) {
			Student std=(Student)obj; // 객체 생성(저장)
			if (std.name.equals(name)) { // 외부에서 입력된 이름과 이미 저장된 이름이 같으면
				return true;
			}
		}
		return false;
	}
	

	
	
}
