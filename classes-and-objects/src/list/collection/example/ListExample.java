package list.collection.example;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String args[]) {
		List<Integer> integers = new ArrayList<Integer>(-50);
//		add
		integers.add(199);
		integers.add(200);
		integers.add(189);
		integers.add(207);
		integers.add(285);

		System.out.println("Elements in List : " + integers);
		System.out.println("Size of list  : " + integers.size());

//		remove

		integers.remove(2);
		integers.remove(3);
		System.out.println("Element in list after removing list" + integers);
		System.out.println("After removal Size of list  : " + integers.size());

//		add in between
		integers.add(2, 244);
		System.out.println("Element of list afer adding element in between list = " + integers);

		integers.add(0, 233);
		System.out.println("Element of list afer adding element in between list = " + integers);

//		get

		int elements = integers.get(2);
		System.out.println("Marks of index 2 = " + elements);

//		set

		integers.set(0, 185);
		System.out.println("Elements in  list after setting the value at 0 index" + integers);

//		loop
		for (int i = 0; i < integers.size(); i++) {
			System.out.println("Print Elements of list " + integers.get(i));

		}
		System.out.println();
	}

}
