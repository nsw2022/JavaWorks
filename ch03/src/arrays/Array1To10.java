package arrays;

public class Array1To10 {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - 변수 사용
		// sum1
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
			sum1 += i;
		}
		System.out.println();
		System.out.println("합계: "+sum1);
		
		
		// 1부터 10까지 출력 - 배열 사용
		int[] arr = new int[10];
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i] + " ");
			arrSum += arr[i];
		}
		System.out.println();
		System.out.println("배열의 합계: "+arrSum);
	}

}
