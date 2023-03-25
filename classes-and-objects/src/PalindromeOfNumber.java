
/**
 * <b>Description:</b>This is class is responsible for finding number is
 * Palindrome or not
 * 
 * @author Ganesh Narvekar
 *
 */
public class PalindromeOfNumber {
	public void calculate() {
		int inputNumber = 111;
		int remainder;
		int reverseOfNumber = 0;
		int anotherNumber = inputNumber;
		while (inputNumber > 0) {
			remainder = inputNumber % 10;
			inputNumber = inputNumber / 10;
			reverseOfNumber = reverseOfNumber + remainder;
		}
		if (reverseOfNumber == anotherNumber) {
			System.out.println("Pallindrome");

		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String args[]) {
		PalindromeOfNumber palindromeOfNumber = new PalindromeOfNumber();
		palindromeOfNumber.calculate();
	}

}
