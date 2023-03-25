package finalexample;

public class TATAEmployee {
	public void display(final int intVar) {
//		intVar = 25; since the argument is declared with final ,assigning new value will give you compile time error. 
		System.out.println("value of intvar" + intVar);
	}

	public static void main(String args[]) {
		final int intVar = 10;
		TATAEmployee employee = new TATAEmployee();
		employee.display(intVar);
	}
}
