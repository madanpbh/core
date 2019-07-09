package core;

import java.util.Arrays;

public class ArrayElementAvgMAxAndMin {

	public static int avgOfMinAndMaxNoInArray(int[] a) {
	Arrays.sort(a);
		int b=a[0];
		int c=a[a.length-1];
		return (b+c)/2;
	}
	public static void main(String[] args) {
	
		int[] a= {10,54,23,32,14,45};
		System.out.println(avgOfMinAndMaxNoInArray(a));

	}

}
