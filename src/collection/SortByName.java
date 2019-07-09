package collection;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{
	
	public String compare(String a,String b) {
	
		return a.name.compareTo(b.name);
	}

}
