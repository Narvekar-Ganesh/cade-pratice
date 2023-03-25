package finalexample;

public class JIOEmployee {
	public void display(int intVar) {
		intVar = 25;
		System.out.println("Value of intvar:" + intVar);

	}
	public static void main(String ards[]) {
		JIOEmployee  employee1=new JIOEmployee();
		final JIOEmployee employee2 =employee1;
		JIOEmployee employee3 = new JIOEmployee();
//		employee2=employee3; since the object is declared as final ,assigning new object to the final object it will show complied time error
	}

}
