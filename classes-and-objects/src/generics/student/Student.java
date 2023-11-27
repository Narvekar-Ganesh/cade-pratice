package generics.student; 

public class Student {
	private String name;
	private int marks;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
}
