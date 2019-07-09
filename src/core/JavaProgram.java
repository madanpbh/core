package core;

import java.util.Scanner;

public class JavaProgram {

	public static void main(String[] args) {
		
		int num,i,count=0;
		Scanner san=new Scanner(System.in);
		System.out.println("enter a number");
		num=san.nextInt();
		
		for(i=2;i<num;i++) {
		if(num%i==0) {
			count++;
			break;
		}
		}
		if(count==0) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("this is not a prime number");
		}

	}

}
