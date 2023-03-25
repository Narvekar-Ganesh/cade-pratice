
public class BookMyshow {
		public void book(Movie movie){
			System.out.println("Booking  behavior is executed for movie");
		}
		
		public void book(Play play){
			System.out.println("Booking behavior is executed for play");

		}
		
		public static void main (String args[]){
			BookMyshow bookMyShow  = new BookMyshow();
			Movie movie = new Movie();
			bookMyShow.book(movie);
		}
	}
