package thissample;

public class ThisTest {

	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		
		bDay.setYear(2023);
		
		// 객체 주소 비교 ( 같음 )
		bDay.printThis();
		System.out.println(bDay); // bDay의 객체주소
		
	}

}
