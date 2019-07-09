package core;

public class ArraySort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,0,4,0,0,1,2};
		for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			
			if(arr[i]==0 && arr[j]!=0) {
				
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
	
				
			}
	
			
		}
	
		
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
	}
	
	
	
}
