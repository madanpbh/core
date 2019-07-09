package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(111,"madan","delhi"));
		list.add(new Student(222,"deepika","jaunpur"));
		list.add(new Student(101,"sintu","pbh"));
		
		System.out.println("roll no unsorted order");
		for(int i=0;i<list.size();i++) 
			System.out.println(list.get(i));
		Collections.sort(list, new SortByRollNo());
		
		System.out.println("rollno sorted order");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("name unsorted order");

	}
	



}
