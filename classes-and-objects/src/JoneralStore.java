
public class JoneralStore {
	public void sell(MariBiscuit maribiscuit){
		System.out.println("!Thanks! Your Mari Buscuit");		
	}
	
	public void sell(ParleBiscuit parlebuscuit){
		System.out.println("!Thanks!Your Parle Biscuit");
		
	}
	
	public void sell(Milk milk){
		System.out.println("!Thanks!Your milk");
			
	}
	
	public void sell(TeaPowder teapowder) {
		
	}
	
	public static void main(String args[]){
		JoneralStore seller = new JoneralStore();
		MariBiscuit maribuscuit = new MariBiscuit();
		ParleBiscuit parlebuscuit = new ParleBiscuit();
		TeaPowder teapowder = new TeaPowder();
		seller.sell(maribuscuit);
		
	}

}
