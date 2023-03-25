package logicalthinking.examples.primenumberfinder;

/**
 * <b>Description:</b> This class id responsible for finding given number is
 * prime or not
 * 
 * @author Ganesh narvekar
 *
 */
public class PrimeNumberFinder {
	public void calculate(int inputNumber) {
		boolean result = false;
		for (int counter = 2; counter < inputNumber; counter++) {
			if (inputNumber % counter == 0) {
				result = true;
				break;

			}

		}
		if (result == true) {
			System.out.println(" Given Number is prime number");
		} else {
			System.out.println("Given Number is not Prime number");
		}
	}

	public static void main(String args[]) {
		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
		primeNumberFinder.calculate(67);
	}

}
