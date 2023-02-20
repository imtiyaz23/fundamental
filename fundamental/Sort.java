package fundamental;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter array of element");
			arr[i]=sr.nextInt();
			
			}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
		
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					
				}
			
			}
			
			System.out.print(arr[i]);
			//System.out.println(n-1);
			
			
		}
		

		

	}

}
