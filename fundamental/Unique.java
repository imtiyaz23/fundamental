package fundamental;

import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out .println("enter the array element");
	        arr[i]=sr.nextInt();
	    }
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ," );
			
		}
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]&& (i!=j))
				{
				count=count+1;
				}
			}
		if(count==0) {
			System.out.println(arr[i]);
		}
	
		}
	
		
	}

}
