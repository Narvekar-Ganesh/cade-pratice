
public class MusicPlayer {
	public void play(Rabbata rabbata) {
		System.out.println("Enjoy your Raabata song !");
	}

	public void play(Baarishein baarishein) {
		System.out.println("Enjoy your Baarishein song !");
	}

	public void play(Soniyo soniyo) {
		System.out.println("Enjoy your Soniyo song !");
	}

	public static void main(String args[]) {
		MusicPlayer musicPlayer = new MusicPlayer();
		Rabbata rabbata = new Rabbata();
		Baarishein baarishein = new Baarishein();
		Soniyo soniyo = new Soniyo();
		musicPlayer.play(soniyo);
	}

}
