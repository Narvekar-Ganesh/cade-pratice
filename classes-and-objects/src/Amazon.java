
public class Amazon {

	public void addTocart(TShirtForMen tShrit) {
		System.out.println("Tshirt added in cart");
	}

	public void addTocart(ShirtForMen shirt) {
		System.out.println("Shirt added in cart");
	}

	public void addTocart(JeansForMen jeans) {
		System.out.println("Jeans added in cart");
	}

	public void addTocart(TrousersForMen trousers) {
		System.out.println("Trouser added in cart");
	}

	public static void main(String args[]) {
		Amazon amazon = new Amazon();
		TShirtForMen tshirt = new TShirtForMen();
		ShirtForMen shirt = new ShirtForMen();
		JeansForMen jeans = new JeansForMen();
		TrousersForMen trouser = new TrousersForMen();
		amazon.addTocart(trouser);
		
	}

}
