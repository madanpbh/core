package collection;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student>
{
public	int compare(Student a,Student b) {
		
		return (int)a.rollno-b.rollno;
}
}
