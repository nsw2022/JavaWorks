package methods;

public class Math1 {

	public static void main(String[] args) {
		// Math 클래스
		// 절대값 구하는 함수 사용 - abs()
		
		int v1 = Math.abs(-7);
		System.out.println("v1 = " + v1);
		
		// 반올림
		long v2 = Math.round(5.7); 
		System.out.println("v2 = " + v2);
		
		// 버림
		double v3 = Math.floor(2.12);
		System.out.println("v3 = " + v3);
		
		// 랜덤 - 무작위수
		double rnd = Math.random();
		System.out.println("rnd = " + rnd);
		
		// 가위바위보
		int 가위바위보 =(int) (Math.random()*3)+1;
		System.out.println("가위바위보 = " + 가위바위보);
		
		
		
	}

}
