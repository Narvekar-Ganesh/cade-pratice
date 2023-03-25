
public class Carpenter { 
	
	public void construct(WoodenFrame woodenFrame) {
		System.out.println("Constructing frame");
	}

	public void construct(WoodenTable woodenTable) {
		System.out.println("Constructing Table");
	}

	public static void main(String args[]) {
		Carpenter carpenter = new Carpenter();
		WoodenFrame woodenFrame = new WoodenFrame();
		WoodenTable woodenTable = new WoodenTable();
		carpenter.construct(woodenTable);
	}

}
