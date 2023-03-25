
public class Drafter {
	
	public void drow(Circle circle){//<access_modifier><space><return_type><space><mathod_name>(<list of argument>)//
		System.out.println("Drow behaviour for Circle");
	}
	
	public void draw(Rectangle rectangle){
		System.out.println("Drow behaviour for Rectangle");
		
	}
	
	public static void main(String args[]){
		Drafter drafter = new Drafter();
		Circle circle = new Circle();
		drafter.drow(circle);
		
		// short shortVar = 135;
		//int intVar = 235;
//		shortVar = intVar;
//		long longVar = 1000;
//		intVar = longVar;
		//intVar = 1000;	
	} 
}

