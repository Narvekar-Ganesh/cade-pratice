
public class Animal {

	public Animal() { // default constructor or parameterless constructor or constructor with no
						// parameter
		System.out.println("I am in default constructor");
	}

	public Animal(int numberOfLegs) { // parameterized constructor
		System.out.println("Animal has been created with number of legs : " + numberOfLegs);
	}

	public static void main(String[] args) {
		Animal animal = new Animal(100);
		System.out.println("Animal constructor is executed");
	}

}
