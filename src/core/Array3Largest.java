package core;

import java.util.Arrays;

public class Array3Largest {

	public static int getThirdLargest(int[] a,int total) {
		/*int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];*/
		Arrays.sort(a);
		return a[total-3];
	}
	public static void main(String[] args) {
		
int a[]= {2,4,1,6,5,7};
System.out.println(getThirdLargest(a,5));
	}

}
