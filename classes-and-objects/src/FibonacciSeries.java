
/**
 * <b>Description:</b> This class is responsible for calculating Fibonacci
 * Series
 * 
 * @author Ganesh narvekar
 *
 */
public class FibonacciSeries {
	public void calculateFibinacci() {
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		for (int i = 1; i < 10; i++) {
			System.out.println(firstNumber);
			thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}

	}

	public static void main(String args[]) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.calculateFibinacci();

	}

}
