
public class User {

	public static void main(String[] args) {

		/*
		 * int result = StatelessCalculator.multiply(10,30);
		 * System.out.println("Result is " + result );
		 */

		int emergencyNumber = StatelessEmergencyCallDialer.dialeFireEmergency(123);
		System.out.println("Emergency Number " + emergencyNumber + " has been dialed");
	}
}
