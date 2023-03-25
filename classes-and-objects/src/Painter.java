
public class Painter {
	
	public void paint(Circle circle){//<access_modifier><space><return_type><space><mathod_name>(<list of argument>)//
		System.out.println("Drow behaviour for Circle");
	}
	
	public void paint(Rectangle rectangle){
		System.out.println("Drow behaviour for Rectangle");
		
	}
	
	public void paint(Square square){
		System.out.println("Drow behaviour for Square");
	}
	
	public static void main(String args[]) {
		Painter painter = new Painter();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		painter.paint(square);
	} 
}
 