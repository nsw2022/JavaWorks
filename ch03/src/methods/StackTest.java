package methods;

public class StackTest {

	public static void main(String[] args) {
		// static 함수 호출( new 사용 안함 )
		// sum - 지역변수
		int sum=add(10, 11);    // add()호출
		System.out.println(sum);
		
	}
	
	public static int add(int n1, int n2) {// 반환 자료형
		// n1과 n2는 매개변수
		// result 지역변수
		int result = n1 + n2; 
		return result;
	}

}
