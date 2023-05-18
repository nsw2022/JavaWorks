package control;

public class Ex11 {

	public static void main(String[] args) {
	
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 1; j++) {
				System.out.println("*");
			} 
			if (i == 4)break;
			for(int k = 0; k < i+1; k++) {
				System.out.print("o ");
			}
		}
		
//		int i = 0;
//		int j = 5;
//		while (i==1) {
//			
//		}
	}
}

