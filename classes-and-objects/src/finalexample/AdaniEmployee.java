package finalexample;

public class AdaniEmployee {
	public void display(float floatVar) {
		final float floatAnotherVar = floatVar;
//		floatAnotherVar= floatAnotherVar; if the final variable assign the same value again it will show compile time error .
		System.out.println("Value of Another Float Variable " + floatAnotherVar);
	}

	public static void main(String args[]) {
		AdaniEmployee employee = new AdaniEmployee();
		AdaniEmployee employee2 = new AdaniEmployee();
		employee.display(10.00f);

		System.out.println(employee);
		System.out.println(employee2);
		String string1 = "laptop";
		String string2 = "laptop";
		string1 = string1.concat("is Lenove");
		System.out.println("Value of String2  " + string2);
		System.out.println("hashcode of string1 : " + string1.hashCode());
		System.out.println("hashcode of string2 : " + string2.hashCode());
		
		System.out.println("shallow comparison of strings  : " + (string1 == string2));
		
		System.out.println("deep comparison of strings  : " + string1.equals(string2));
	}
}
