
public class TeacherOfCollege extends Library {
	@Override
	public void issueBook() {
		System.out.println("Teacher issued book succesfully ");
	}
	@Override

	public void returnBook() {
		System.out.println("Teacher return book successfully");
	}

	public static void main(String[] args) {
		Library librorioun = new Library();
		CollegeStudent student = new CollegeStudent();
		TeacherOfCollege teacher = new TeacherOfCollege();
		librorioun.issueBook();
		librorioun.returnBook();
		librorioun = student;
		student.issueBook();
		librorioun=teacher;
		teacher.issueBook();
		teacher.returnBook();
		
		
		
	}

}
