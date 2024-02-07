
public class StatelessCalculator {

	private StatelessCalculator() {
		// empty /default constructor
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int inputNumber1, int inputNumber2) {
		return inputNumber1 - inputNumber2;
	}

	public static int multiply(int inputNumber1, int yinputNumber2) {
		return inputNumber1 * yinputNumber2;
	}

	public static int division(int inputNumber1, int inputNumber2) {
		return inputNumber1 / inputNumber2;
	}

	public static void main(String args[]) {
		int abs = StatelessCalculator.division(4, 5);
		System.out.println(abs);

	}
}