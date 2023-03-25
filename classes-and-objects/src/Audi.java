
public class Audi extends Car {
	@Override
	public void toWash() {
		System.out.println("Wasging your Audi");
	}

	public static void main(String args[]) {
		Car car = new Car();
		car.toWash();
		BMW bmw = new BMW();
		Audi audi = new Audi();
		car = bmw;
		car.toWash();
		car = audi;
		car.toWash();
	}
}
