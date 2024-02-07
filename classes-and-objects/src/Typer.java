
public class Typer {
	public void type() {
		System.out.println(" Nothing to Type");
	}

	public void type(Name abc, int numOfStr) {
		System.out.println("Typer type both value :");
	}

	public void type(int numOfStr, String str) {
		System.out.println("Typer type both value :");
	}

	public void type(int numOfStr, double dubleNumber) {
		System.out.println("typer" + numOfStr);
	}

	public void type(int number) {
		System.out.println("Typer type  an integer value:" + number);
	}

	public void type(String str) {
		System.out.println("Typer type  an integer value:" + str);
	}

	public static void main(String args[]) {
		Typer type = new Typer();
//	Name name = new Name ();
		type.type(42);

	}
}
