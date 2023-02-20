package fundamental;

import java.util.Scanner;

public class Arraydec {
	public static int [] takeInput() {
		Scanner sr=new Scanner(System.in);
		int  n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element "+ i +  "th of index");
			arr[i]=sr.nextInt();
		}
		return arr;
	}
	public static void printArray( int arr[]) {
		//Scanner sr=new Scanner(System.in);
		//int n=sr.nextInt();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	public static int prod (int arr[]) {
		int pro=1;
		for(int i=0;i<arr.length;i++) {
			pro*=arr[i];
		}
		return pro;
	}
	public static int largest (int arr[]) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			//int max=Integer.MIN_VALUE;
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int linearSearch(int arr[],int n)
	{ 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return n;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		printArray(arr);
		int result=sum(arr);
		System.out.println(result);
		int mult=prod(arr);
		System.out.println(mult);
		int highest=largest(arr);
		System.out.println(highest);
		Scanner sr=new Scanner (System.in);
		int t=sr.nextInt();
		int x=sr.nextInt();
		
}
}
