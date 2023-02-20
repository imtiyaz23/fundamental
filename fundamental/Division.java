package fundamental;

import java.util.Scanner;

public class Division {
	public static int divide(int num,int den)
	{    
		if(den==0) {
		return Integer.MIN_VALUE;
	}
		System.out.println("inside");
		return(num/den);
	
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int x=sr.nextInt();
		int y=sr.nextInt();
		int result= divide(x,y);
		System.out.println(result);

	}

}
