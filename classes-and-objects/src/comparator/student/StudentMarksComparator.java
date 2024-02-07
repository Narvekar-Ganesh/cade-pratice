package comparator.student;

import java.util.Comparator;

import generics.student.Student;

public class StudentMarksComparator implements Comparator<Student>{

	public int compare(Student firstStudent, Student secondStudent) {
		if((firstStudent.getMarks() < secondStudent.getMarks())&&
		   (firstStudent.getAge() < secondStudent.getAge())) {
			return -1;
		} else if((firstStudent.getMarks() > secondStudent.getMarks())&&
				   (firstStudent.getAge() > secondStudent.getAge())) {
			return 1;
		}
		return 0;
	}

}
