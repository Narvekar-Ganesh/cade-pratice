package list.collection.example;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<Integer>();

		integers.add(199);
		integers.add(2003);
		integers.add(20);
		integers.add(204);
		integers.add(205);

		System.out.println("Elements in List : " + integers);
		System.out.println("Size of list  : " + integers.size());

		integers.remove(2);
		integers.remove(3);
		System.out.println("Element in list after removing list" + integers);
		System.out.println("after removal Size of list  : " + integers.size());
		
		Integer sampleInteger = 10; //It is a wrapper class. It wraps a primitive data type - int
		int sampleInt = 10; //primitive data type 
		
//		List<int> integerList = new ArrayList<E>();
		/*
		 * Why Java has introduced a wrapper class. 
		 * The collection framework does not deal with primitive data types - int , char , float , double , boolean
		 * Hence, to deal with primitive data type , Java has introduced wrapper classes.
		 * int -> Integer 
		 * float - > Float
		 * boolean -> Boolean
		 * double -> Double 
		 * 
		 * 
		 */
		
		
		
		
	}

}
