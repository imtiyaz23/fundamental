package fundamental;

import java.util.Scanner;

public class Mult_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sr=new Scanner(System.in);
       int n=sr.nextInt();
       int fact=0;
       for(int i=1;i<=10;i++)
       {
    	   fact=n*i;
    	   System.out.println(fact);
       }
    	   
       }

}
