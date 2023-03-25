
public class Hotel {

	public void cook(DalRice dalRice) {
		System.out.println("Your Dal Rice is under process");
	}

	public void cook(CholeBhature choleBhature) {
		System.out.println("Your Chole Bhature is under process");
	}

	public void cook(PanneerTikka panneerTikka) {
		System.out.println("Your Panneer Tikka is under process");
	}

	public static void main(String args[]) {
		Hotel darabar = new Hotel();
		DalRice dalRice = new DalRice();
		CholeBhature choleBhature = new CholeBhature();
		PanneerTikka pannerTikka = new PanneerTikka();
		darabar.cook(choleBhature);
	}
}
