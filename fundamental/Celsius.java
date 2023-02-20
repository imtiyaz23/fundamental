package fundamental;

import java.util.Scanner;

public class Celsius {
	public static float fToC(int f) {
		float result=(f-32)*5/9;
		return(result);
	}
	public static void fTable(int start,int end,int size) 
	{
		for(int i=start;i<=end; i=i+size) {
			System.out.println(i+ " " +fToC(i));
		}
	}
	

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int s=sr.nextInt();
		int e=sr.nextInt();
		int w=sr.nextInt();
		fTable(s,e,w);
	

	}

}
