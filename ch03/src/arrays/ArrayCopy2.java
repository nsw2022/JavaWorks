package arrays;



public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N','E','T'};
		char[] arr2 = new char[3];
		char[] arr3;
		/*
		 * 2 1 0
		 * 
		 * 0 1 2
		 * 
		 * */
		
		for (int i = 0; i <arr1.length; i++) {
			arr2[2-i] = arr1[i];
		}
		System.out.println(arr2);
		
		
		
	}

}
