package list.collection.example;

import java.io.IOException;

public class StudentExample {

	public static void main(String[] args) {
//		examplesOnMethodInvocations();
		
		StudentExample studentExample = new StudentExample();
//		studentExample.doRegistrationOfStudent();
//		studentExample.doRegistrationOfStudentwithFirstNameAsNull();
		studentExample.doRegistrationOfStudentwithRollNumberAsZero();
		
		
	}

	private void doRegistrationOfStudent() {
		System.out.println("In method of doRegistrationOfStudent");
		
		Student student = new Student();
		student.setRollNumber(100);
		student.setStudentName("Student-1");
		student=null;
		
		StudentRegistrationService studentRegitrstion = new StudentRegistrationServiceImpl();
    	System.out.println("Student details are as :" + student); 

		try {
			boolean result = studentRegitrstion.registerStudent(student);
			if(result == true) {
				System.out.println();
			}
	
		}catch(IOException excrption) {
			System.out.println("IOException occured");
		}

	}

	private void doRegistrationOfStudentwithFirstNameAsNull() {
		System.out.println("In method of doRegistraofStudentwithFirstnameNull");

		
		Student student = new Student();
	    student.setRollNumber(110);
	    student.setStudentName(null);
	    
	    StudentRegistrationService studentRegistrationService =  new StudentRegistrationServiceImpl();
	    try {
	    	boolean result = studentRegistrationService.registerStudent(student);	
	    	if(result == true) {
	    		System.out.println("Student is registered successfully");
	    	}
	    }catch(IOException exception) {
	    	System.err.println("Exception is occured" + exception.getMessage());
	    }
	    
	    
	    	
	    }
	private void doRegistrationOfStudentwithRollNumberAsZero() {
    	System.out.println("in method of doRegistraofStudentwithZeroRollNumber ");
    	 
    	Student student = new Student();
    	student.setRollNumber(0);
    	student.setStudentName("sid");
    	StudentRegistrationService  studentRegistrationService = new StudentRegistrationServiceImpl();
    	System.out.println("Student details are as :" + student);
    	try {
    		boolean result =studentRegistrationService.registerStudent(student);
    	
    		if(result == true) {
    			System.out.println("Student is registered successfully");
    		
    		}
    		}catch(IOException exception) {
    			System.out.println("Exeption occured "+ exception.getMessage());
    		}
	
    	}
    	 
    	  
   
	    
	    	
	    	
	    
	    
	    
	 
		
	}


