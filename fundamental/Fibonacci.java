package fundamental;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int x=0;
     int y=1;
     int z=0;
     while(z<=n)
     {
    	 System.out.print(z + " " );
    	x=y;
    	y=z;
    	z=x+y;
    	
    	
     }
	}

}
