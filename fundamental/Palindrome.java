package fundamental;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rev=0;
    int z=n;
    while(n>0)
    {
    	rev=(rev*10)+n%10;
    	n=n/10;
    }
    if(rev==z) 
    {
    	System.out.print("number is palindrome");
    }
    else
    {
    	System.out.print("not");
    }

}
}

	
