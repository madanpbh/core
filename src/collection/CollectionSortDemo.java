package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("z");
		al.add("c");
		al.add("e");
		al.add(new Integer(10));
		al.add(null);

		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}
