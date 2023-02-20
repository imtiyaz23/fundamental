package fundamental;

import java.util.Scanner;

public class SumNumber {
int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sr=new Scanner(System.in);
       int n= sr.nextInt();
       
       int sum=0;
       for(int i=1;i<=n;i++)
       {
    	 System.out.print(i);
    	   sum=sum+i;
    	 // System.out.println("sum" +sum);
    	   
       }
       System.out.println();
       System.out.println("sum " +sum);
	}
	

}
