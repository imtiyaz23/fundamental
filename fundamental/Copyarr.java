package fundamental;

import java.util.Scanner;

public class Copyarr {
	
	public static int fn(int n) {
		int a=0;
		int b=1;
		int c=0;
		if(n==0)
			return n;
		for(int i=1;i<=n;i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(i+"="+a+"+"+b);
			
		}
		return b;
		
	}
	

	public static void main(String[] args) {
		int ans=fn(9);
		System.out.print(ans);
		

	}

}
