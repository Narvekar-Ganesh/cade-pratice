
public class PainterForWorker extends Worker {
	@Override
	public void toWork() {
		System.out.println("Painter perform painting behaviour");
	}

	public static void main(String args[]) {
		Worker work = new Worker();
		CarpenterForWorker carpenter = new CarpenterForWorker();
		PainterForWorker painter = new PainterForWorker();
		work.toWork();
		work = carpenter;
		work.toWork();
		work = painter;
		work.toWork();
	}
}
