package fundamental;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int  n=s.nextInt();
       int sumeven=0;
       int sumodd=0;
       while(n>0)
       {
    	   int t= n%10;
    	   if(t%2==0) 
    	   {
    		sumeven+=t;
    		
    		   
    	   }
    	   else 
    	   {
    		   sumodd+=t;
    		  
    	   }
    	   n=n/10;
       }
       System.out.print(sumeven+ " " +sumodd);
       }

}
