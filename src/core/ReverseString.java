package core;

public class ReverseString {

	public static void main(String[] args) {
		String input="madan";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
		reverse=reverse+input.charAt(i);
		}
		System.out.println(reverse);
	}

}
