package core;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    @SuppressWarnings("uncheked")
	public ArrayList listCustomers()
	{
		ArrayList l=new ArrayList();
		l.add("madan");
		l.add("Deepika");
		l.add("rahul");
		l.add("ranjay");
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		List ll=b.listCustomers();
		System.out.println(ll);
	}

}
