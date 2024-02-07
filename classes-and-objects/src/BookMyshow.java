
public class BookMyshow {
		public void book(Kantara kantara){
			System.out.println("Booking  behavior is executed for movie Kantara ");
		}
		public void book(Silar silar){
			System.out.println("Booking  behavior is executed for movie Kantara ");
		}
		public void book(Dunki dunki){
			System.out.println("Booking  behavior is executed for movie Kantara ");
		}
		public void book(Tiger tigerJindaHai){
			System.out.println("Booking  behavior is executed for movie Kantara ");
		}
		public void book(Play chanChanGoshti){
			System.out.println("Booking behavior is executed for play");

		}
		
		public static void main (String args[]){
			BookMyshow bookMyShow  = new BookMyshow();
			Silar silar = new Silar();
			bookMyShow.book(silar);
		}
	}
