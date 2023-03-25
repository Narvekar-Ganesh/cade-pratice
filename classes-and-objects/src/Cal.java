
public class Cal {
	public void add(int x,int y) {
		System.out.print("Addation of two integer number :");
	}
	public void add(double x, double y) {
		System.out.println("Addation of two Double number");
	}
	public static void main(String args[]) {
		Cal cal = new Cal();
		cal.add(1.2,2.1);
	}
}