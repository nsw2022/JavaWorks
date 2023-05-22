package objectarray;

public class Dog {
	//강아지 이름 가져오는 메소드
	public String getName() {
		return dogname;
	}
	//강아지 이름 설정하는 메소드
	public void setName(String dogname) {
		this.dogname = dogname;
	}
	//강아지 종을 가져하는 메소드
	public String getType() {
		return type;
	}
	//강아지 종을 설정하는 메소드
	public void setType(String type) {
		this.type = type;
	}
	
	public Dog() {}
	
	private String dogname;
	private String type;
	
	
}
