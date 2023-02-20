package fundamental;

import java.util.Scanner;

public class SumDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s= new Scanner(System.in);
	     int n=s.nextInt();
	     int digit=0;
	     while(n>0) {
	    	 int t=n%10;
	     digit=digit+t;
	    n=n/10;
		}
       System.out.print("sum of digit= " +digit);
	}

}
