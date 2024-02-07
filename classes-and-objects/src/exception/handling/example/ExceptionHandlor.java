package exception.handling.example;

public class ExceptionHandlor {
	public static void main (String args[]) {
		ExceptionHandlor exception = new ExceptionHandlor();
		 
			try {
				String employee = "sahil" ;
				System.out.println("Employee name"+employee);
			}
			catch(NullPointerException nullpointexception){
				System.out.println("employee name can not null");
			}finally {
				System.out.println("FINALLY EXECUTE");
				
			}
				
			}
			
		
	

	private static void tryCatchWithFinally() {
		// TODO Auto-generated method stub
		
	}

}
