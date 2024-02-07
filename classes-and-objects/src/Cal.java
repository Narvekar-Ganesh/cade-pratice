
public class Cal {
	public void add(int x,int y) {
		int b = x + y;
		System.out.print("Addation of two integer number :" +b );
	}
	public void add(double x, double y) {
		double c = x+y;
		System.out.println("Addation of two Double number"+ c);
	}
	public static void main(String args[]) {
		Cal cal = new Cal();
		cal.add(1.3,2.3);
	}
}