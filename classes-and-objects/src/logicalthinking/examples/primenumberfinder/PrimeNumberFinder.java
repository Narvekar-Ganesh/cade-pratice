package logicalthinking.examples.primenumberfinder;

/**
 * <b>Description:</b> This class id responsible for finding given number is
 * prime or not
 * 
 * @author Ganesh narvekar
 *
 */
public class PrimeNumberFinder {
	public void find(int inputNumber) {
		boolean result = isGivenNumberPrime(inputNumber);// segregation of responsibilities
		displayResult(result, inputNumber);
	}

	private boolean isGivenNumberPrime(int inputNumber) {// these behaviors should be hidden from external world
		boolean result = false;
		for (int counter = 2; counter < inputNumber; counter++) {
			if (inputNumber % counter == 0) {
				result = true;
				break;
			}
		}
		return !result;
	}

	private void displayResult(boolean result, int inputNumber) {// these behaviors should be hidden from external world
		if (result) {
			System.out.println("Given Number " + inputNumber + " is prime number");
		} else {
			System.out.println("Given Number " + inputNumber + " not Prime number");
		}
	}

	public static void main(String args[]) {
		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
		primeNumberFinder.find(67);
	}
}
