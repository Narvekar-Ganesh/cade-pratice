package home.practice.domain;

public class Student {
	private  int  rollNumber;
	private String  name ;
	private int marks;
	
	public  int getRollNumber() {
		return this.rollNumber ;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

	public void setName(String name) {
		this.name = name ;
	}

	public int getMarks() {
		return this.marks;
	}
	
	public  void setMarks(int marks) {
		this.marks = marks; 
	}
}

