package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Student {

	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	
		/*public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

*/
		public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
}

	
