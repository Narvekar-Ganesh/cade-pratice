/**
 * <b>Description :</b> This is classs is responsible for demonstrating square and cube of  even / odd numbers 
 * @author Ganesh Narvekar
 *
 */
public class EvenOddForLoopDemonstrator {
	
	/**
	 * Description : This method is for calculating Square or Cube for Even or Odd Numbers 
	 */
	public void calculateSquareOrCubeForEvenOddNumbers() {
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("even Number square=" + calculateSquare(i));
			} else {
				System.out.println("Odd Number cube =" + calculateCube(i));
			}
		}
	}

	public static void main(String args[]) {
		EvenOddForLoopDemonstrator evenOddForLoopDemonstrator = new EvenOddForLoopDemonstrator();
		evenOddForLoopDemonstrator.calculateSquareOrCubeForEvenOddNumbers();
//		Math math = new Math();
		
	}
	
	/**
	 * stateless method
	 * @param inputNumber
	 * @return
	 */
	private int calculateSquare(int inputNumber) {
		return inputNumber * inputNumber;
	}
	
	private int calculateCube(int inputNumber) {
		return inputNumber * inputNumber * inputNumber;
	}
}
