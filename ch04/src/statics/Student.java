package statics;

public class Student {
	private static int serialNum = 1000;  // 기준번호
	private int stdId;    // 학번
	private String name;  // 이름
	
	Student() {// 기본생성자
		serialNum++;	   // serialNum
		stdId = serialNum; // 증가된 번호를 학번에 대입
	} 
	
	// get(), set()
	String getName() {
		return name;
	}
	
	int getStdId() {
		return stdId;
	}
	
	void setStdId(int stdId) {
		this.stdId=stdId;
	}

	
	void setName(String name) {
		this.name=name;
	}

	
}

