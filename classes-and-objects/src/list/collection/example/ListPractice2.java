package list.collection.example;

import java.util.ArrayList;
import java.util.List;

public class ListPractice2 {
	public static void main(String args) {
		List<Integer> marks = new ArrayList<Integer>();
		   
		
		marks.add(92);
		marks.add(82);
		marks.add(75);
		marks.add(98);
		
		System.out.println("Element of an list =" + marks);
		System.out.println("Size of an Array = " + marks .size());
		
		marks.remove(2);
		System.out.println("Element of list= " + marks);
		System.out.println("Size of an Array after removing marks = " + marks .size());

		
		int studentmarkas = marks.get(2);
		System.out.println("Markas of index 2="+ studentmarkas);
		 
		Integer sampleInteger = 10; // It is a wrapper class. It wraps a primitive data type - int
		int sampleInt = 10; // primitive data type

//		List<int> integerList = new ArrayList<E>();
		/*
		 * Why Java has introduced a wrapper class. The collection framework does not
		 * deal with primitive data types - int , char , float , double , boolean Hence,
		 * to deal with primitive data type , Java has introduced wrapper classes. int
		 * -> Integer float - > Float boolean -> Boolean double -> Double
		 * 
		 * 
		 */


	}

}
