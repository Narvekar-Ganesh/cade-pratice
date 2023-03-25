
public class Printer {
	
	public void print(MathsBook mathsBook) {
		System.out.println("Maths book is Printing");
	}
	
	public void print(HistoryBook historyBook) {
		System.out.println("History book is Printing");
	}
	
	public void print(ScienceBook scienceBook) {
		System.out.println("Science book is Printing");
	}
	
	public void print(GeographyBook geographyBook) {
		System.out.println("Geography Book is Printing");
		
	}
	
	public static void main(String args[]) {
		Printer lenovo = new Printer();
		MathsBook mathsBook = new MathsBook();
		HistoryBook historyBook = new HistoryBook();
		ScienceBook scienceBook = new ScienceBook();
		GeographyBook geographyBook = new GeographyBook();
		lenovo.print(scienceBook);
	} 

}
