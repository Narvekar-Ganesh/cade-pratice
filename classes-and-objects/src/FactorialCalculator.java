
/**
 * <b>Description:</b> This is class is responsible for calculating factorial
 * for a given number
 * 
 * 
 * @author Ganesh Narvekar
 *
 */
public class FactorialCalculator {
	public void calculate(int inputNumber) {

		int result = 1;
		for (int counter = inputNumber; counter >= 1; counter--) {
			result = counter * result;
		} // for

		System.out.println("result is : " + result);

	}

	public static void main(String args[]) {
		FactorialCalculator ifLoopDemonstrator = new FactorialCalculator();
		ifLoopDemonstrator.calculate(5);

	}
}
