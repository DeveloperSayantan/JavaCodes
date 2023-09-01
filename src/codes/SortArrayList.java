package codes;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		list.add(60);
		list.add(80);
		list.add(40);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
