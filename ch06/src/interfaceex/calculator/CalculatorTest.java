package interfaceex.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		MyCalculator mycal = new MyCalculator();
		int x = 10, y = 0;
		System.out.println(mycal.add(x, y));
		System.out.println(mycal.subtract(x, y));
		System.out.println(mycal.times(x, y));
		System.out.println(mycal.divide(x, y));

	}

}
