package inter.face.example;

public class InterFaceExample {

	public static void main(String[] args) {

//		AdhocResponsibilities adhocResponsibilities = new AdhocResponsibilities();
		TechnicalLead technicalLead = new TechnicalLead();
		SeniorSoftwareEngineer seniorSoftwareEngineer = new SeniorSoftwareEngineer();
		Manager manager = new Manager();
		
		if(technicalLead instanceof AdhocResponsibilities) {
			System.out.println("Techincal lead is playing 'check attendance' responsibility");
		} 
		
		if(seniorSoftwareEngineer instanceof AdhocResponsibilities) {
			System.out.println("Senior software engineer is playing 'check attendance' responsibility");
		}
		
		if(manager instanceof AdhocResponsibilities) {
			System.out.println("Manager is playing 'check attendance' responsibility");
		}
	}

}
