package thissample;



public class Birthday {

	int year;
	int month;
	int day;
	
	public void setYear(int year) {
		this.year = year;
	} 

	// this의 객체 주소를 출력할 함수를 만듬
	public void printThis() {
		System.out.println(this);
	}
	
}
