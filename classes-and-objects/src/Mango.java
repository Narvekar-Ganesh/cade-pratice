
public class Mango extends Fruit {
	@Override
	public void toGrow() {
		System.out.println("Grow Behaviour for Fruit Mango ");
	}

	public static void main(String args[]) {
		Fruit fruit = new Fruit();
		fruit.toGrow();
		Mango mango = new Mango();
		Chiku chiku = new Chiku();
		fruit = mango;
		fruit.toGrow();
		fruit = chiku;
		fruit.toGrow();

	}

}
