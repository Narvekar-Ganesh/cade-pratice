
/**
 * <b>Description:</b> This class id responsible for finding given number is
 * prime or not
 * 
 * @author Ganesh narvekar
 *
 */
public class PrimeNumberFinder {
	public void calculate(int inputNumber) {
		int temporary = 0;
		for (int i = 2; i <= inputNumber; i++) {
			if (inputNumber % i == 0) {
				temporary = temporary + 1;

			}

		}
		if (temporary == 0) {
			System.out.println(" Given Number is Not prime number");
		} else {
			System.out.println("Given Number is Prime number");
		}
	}

	public static void main(String args[]) {
		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
		primeNumberFinder.calculate(7);
	}

}
