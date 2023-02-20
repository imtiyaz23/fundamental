package fundamental;

import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Arraysearch ar=new Arraysearch();
          ar.getdata();
          

	}
     void getdata() {
    	 Scanner sr=new Scanner(System.in);
    	 int n=sr.nextInt();
    	 int arr[]= new int[n];
    	 
    	 for(int i=0;i<n;i++)
    	 {
    		 System.out.println("enter the array of element");
    		 arr[i]=sr.nextInt();
    		 
    	 }
         for(int i=0;i<n;i++)
        	 System.out.print(arr[i]);
         System.out.println("enter the search element");
    	 int key=sr.nextInt();
    	 int flag=0;
    	 int pos=0;
         
         for(int i=0;i<n&&flag==0;i++)
         {
        	
        	if(arr[i]==key) { 
        		flag=1;
        		pos=pos+1;
        	}
        	if(flag==1) {
        		System.out.println("search the data"+pos);
        	}
        		else
        			System.out.println("not found");
 
     }
        	 
     }
          
}
