package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		// 1. 기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들때
		// 2. 배열의 모든 요소에 자료가 꽉 차서 더큰 배열을 만들때
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		// 첫번째 방법 - 대입하여 복사
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; //arr1을 arr2에 복사함
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 두번째 방법 - 기본제공 되는 clone 메소드 사용
		int[] arr3 = new int[5];
		arr3 = arr1.clone();
		for (int i : arr3) {
			System.out.print(i+" ");
		}
		System.out.println();
		// 세번째 방법 System 클래스에 arrycopy()가 있음
		// 첫번째 인자 - 배열 원본
		// 두번째인자 - 원본배열에서 복사할 인덱스 시작번호
		// 세번째 - 새 배열
		// 네번째 - 새 배열에서 붙여넣을 시작 인덱스
		// 다섯번째 배열의 크기
		int[] arr4 = new int[5];
		System.arraycopy(arr1, 0, arr4, 0, 5);
		for (int i : arr4) {
			System.out.print(i+" ");
		}
		
		
		
		
	}

}
