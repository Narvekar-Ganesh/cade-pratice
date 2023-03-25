
public class ButterscotchCake extends LittleCake {
	@Override
	public void toBake() {
		System.out.println("Baking behaviour of Butterscotch  cake class");
	}

	public static void main(String args[]) {
		LittleCake littleHappyCake = new LittleCake();
		littleHappyCake.toBake();
		ChocolateCake chocolateCake = new ChocolateCake();
		littleHappyCake = chocolateCake;
		littleHappyCake.toBake();
		ButterscotchCake butterscotchCake = new ButterscotchCake();
		littleHappyCake = butterscotchCake;
		littleHappyCake.toBake();
	}
}
