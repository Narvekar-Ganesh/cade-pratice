
/**
 * <b>Description:</b> This class is use for Calculating Square and Sum of given number 
 * @author Ganesh  Narvekar
 *
 */
public class SquareAndSumOfEachDigitCalculator {
	public void calculate(int inputNumber) {
		int answer = 0;
		for (int counter = inputNumber; counter > 0;) {
			int modNumber = counter % 10;
			int squreNumber = modNumber * modNumber;

			answer = squreNumber + answer;
			counter = counter / 10;
		}
		System.out.println("answer is calculated as : " + answer);
	}

	public static void main(String args[]) {
		SquareAndSumOfEachDigitCalculator squareAndSumOfEachDigitCalculator = new SquareAndSumOfEachDigitCalculator();
		squareAndSumOfEachDigitCalculator.calculate(555);
	}

}
