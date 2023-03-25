public class Saloon {

	public void haircut(UCut uCut) {
		System.out.println(" Your hairs  are cutting in Ucut shape");
	}

	public void haircut(ChoppyLayer choppyLayer) {
		System.out.println(" Your hairs are cutting in Choppy Layer hair style");
	}

	public void haircut(SlantCut slantCut) {
		System.out.println(" Your hairs are cutting in Slant Cut hair style");
	}

	public static void main(String args[]) {
		Saloon lakme = new Saloon();
		UCut uCut = new UCut();
		ChoppyLayer choppyLayer = new ChoppyLayer();
		SlantCut slantCut = new SlantCut();
		lakme.haircut(slantCut);
	}

}
