package codes;

import java.util.ArrayList;
import java.util.Iterator;

public class DisplayArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Panda");
		list.add("Elephant");
		
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(2,"Monkey");
		System.out.println(list);
		
//		System.out.println("Using Iterator.");
//		System.out.println("****************");
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//		System.out.println(itr.next());
//		}
//		System.out.println();
//		System.out.println("Using For loop.");
//		System.out.println("****************");
//		for(String animals : list) {
//			System.out.println(animals);
//		}

	}

}
