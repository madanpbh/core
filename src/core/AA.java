package core;

import java.util.Scanner;

public class AA {

	 //public boolean isPalindrome(String input) {

			/*String s="race a car";
			String[] input=s.toCharArray();
			String[] output="";
			for(int i=input.length();i>0;i++){
			    
			    for(int j=input.length()-1;j>0;j++){
			       
			       if(input[i]==input[j])
			       {
			       i++;
			       }
			       else{
			       output=output+input.charAt(i);
			       }
			}
	}*/
	public static void main(String[] args) 
	
	{
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      //int length = str.length();
	 for(int i=str.length()-1;i>=0;i--)
	     // for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev)) {
	         System.out.println(str+" is a palindrome");
	    	 
	      }
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}



