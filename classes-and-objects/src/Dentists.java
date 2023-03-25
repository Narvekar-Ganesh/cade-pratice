
public class Dentists extends Doctor {
	@Override
	public void toChek() {
		System.out.println("Special chekup for teeth");
	}

	public static void main(String args[]) {
		Doctor doctor = new Doctor();
		Cardiologists cardiologists = new Cardiologists();
		Dentists dentists = new Dentists();
		doctor.toChek();
		doctor = cardiologists;
		doctor.toChek();
		doctor = dentists;
		doctor.toChek();
	}
}
