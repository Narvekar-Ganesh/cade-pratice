
public class ServiceCenter {
	
	public void wash(TwoWheeler bike){
		System.out.println("Your Tow Wheeler is now clean ");		
	}
	
	public void wash(FourWheeler car){
		System.out.println("Your Four Wheeler is now clean");
	}
	
	public void wash(EightWheeler bus){
		System.out.println("Your Eight Wheeler Wheeler is now clean");
	}
		
	public static void main(String args[]){
		 ServiceCenter honda = new ServiceCenter();
		 TwoWheeler bike = new TwoWheeler();
		 EightWheeler tempo = new EightWheeler();
		 honda.wash(tempo);
	}
}

