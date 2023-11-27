package comparator.student;

import java.util.Collections;
import java.util.List;

import generics.student.Student;
import generics.student.StudentListGenerator;

public class ComparatorExample {
	public static void main(String[] args) {
		StudentListGenerator studentListGenerator = new StudentListGenerator();
		
		List<Student> students = studentListGenerator.generate();
		System.out.println("before sorting : " + students);
		
		Collections.sort(students, new StudentMarksComparator());
		System.out.println("=============================================================");
		
		System.out.println("step-1 : after sorting by marks : " + students);
		
//		Collections.sort(students , new StudentAgeComparator());
		
//		System.out.println("=============================================================");
		
//		System.out.println("step-2 : after sorting by age : " + students);
		
	}

}
