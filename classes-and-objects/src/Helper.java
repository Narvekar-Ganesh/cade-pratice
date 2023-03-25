
public class Helper {

	public void show(PoliceEmergency policeEmergency) {
		int policeNumber = 122;
		System.out.println("Police Emergency number is:" + policeNumber);
	}

	public void show(MedicalEmergency medicalEmergency) {
		int medicalNumber = 102;
		System.out.println("Medical Emergency number is:" + medicalNumber);
	}

	public void show(FireEmergency fireEmergency) {
		int fireNumber = 101;
		System.out.println("Fire Emergency number is:" + fireNumber);
	}

	public void show(WomenEmergency womenEmergency) {
		int womenNumber = 1091;
		System.out.println("Women Emergency number is:" + womenNumber);
	}

	public static void main(String args[]) {
		Helper helper = new Helper();
		PoliceEmergency policeEmergency = new PoliceEmergency();
		MedicalEmergency medicalEmergency = new MedicalEmergency();
		FireEmergency fireEmergency = new FireEmergency();
		WomenEmergency womenEmergency = new WomenEmergency();
		helper.show(womenEmergency);
	}

}
