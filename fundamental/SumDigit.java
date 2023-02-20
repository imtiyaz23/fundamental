package fundamental;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     int digit=0;
     while(n>0) {
    	 int t=n%10;
     digit=digit+t;
     n=n/10;
	}
System.out.println(digit);
}
	}

