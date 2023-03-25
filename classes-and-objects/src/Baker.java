
public class Baker {
	
	public void bake(StrawberryCake strawberryCake){
		System.out.println("Enjoy your Strawberry Cake");
	}

	public void bake(MangoCake manogoCake){
		System.out.println("Enjoy your Mango Cake ");
		
	}
	
	public void bake(AlmondCake almondCake){
		System.out.println("Enjoy your Almond Cake");
		
	}
	
	public static void main(String args[]) {
		Baker littelcake = new Baker();
		StrawberryCake strawberryCake = new StrawberryCake();
//		MangoCake mangoCake = new MangoCake();
//		AlmondCake almondCake = new AlmondCake();
		littelcake.bake(strawberryCake);
	}
}
