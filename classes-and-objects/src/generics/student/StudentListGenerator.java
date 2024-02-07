package generics.student;

import java.util.ArrayList;
import java.util.List;

public class StudentListGenerator {

	
	public List<Student> generate(){
		List<Student> students = new ArrayList<Student>();
		//write your implementation
		
		Student student2 = new Student();
		student2.setName("Bunty");
		student2.setMarks(10);
		student2.setAge(20);
		students.add(student2);
		
		student2 = new Student();  
		student2.setName("Sahil");
		student2.setMarks(96);
		student2.setAge(18);
		students.add(student2);
		 
		
	  student2 =new Student(); 
	  student2.setName("Shaurya"); 
	  student2.setMarks(99);
	  student2.setAge(29); 
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Ganesh"); 
	  student2.setMarks(75);
	  student2.setAge(26); 
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Vihan"); 
	  student2.setMarks(82);
	  student2.setAge(22); 
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Suresh"); 
	  student2.setMarks(26);
	  student2.setAge(68);
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Ravi"); 
	  student2.setMarks(65);
	  student2.setAge(23); 
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Aba"); 
	  student2.setMarks(65);
	  student2.setAge(19); 
	  students.add(student2);
	  
	  student2 = new Student(); 
	  student2.setName("Gayatri"); 
	  student2.setMarks(65);
	  student2.setAge(25); 
	  students.add(student2);
		 		
		return students;
	}
}
