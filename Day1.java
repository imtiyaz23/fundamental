package Futurense.com;

import java.util.*;
public class Day1 {
	public static void printDigit(int num) {
		while(num>0) {
			System.out.println(num%10);
			num=num/10;
		}
		return;
	}
	public static int reverse(int num){
		int temp=0;
		int i=0;
		while(num>0) {
			temp=temp*10+num%10;
			num=num/10;
			
		}
		return temp;
	}
	public static boolean isPalindrome(int num) {
		int temp=reverse(num);
		if(temp==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeDigit(int num) {
		while(num>0) {
			int temp=num%10;
			if(isPrime(temp)) {
				System.out.print(temp + ",");
			}
			num=num/10;
		}
		System.out.println();
		return;
	}
	public static int sumOfDigit(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
	public static int reducedDigit(int num) {
		while(num>9) {
			num=sumOfDigit(num);
		}
		return num;
	}
	public static void starPattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void starPattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void starPattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j<=i||j>=2*n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void starPattern4(int n) {
		int k=1;
		int tem=((n)*(n+1)/2)+1;
		int dif=2;
		int start=n;
		int end=n;
		
		for(int i=1;i<=n;i++) {
			
			int temp=tem;
			for(int j=1;j<=2*n-1;j++) {
				
				if(j>=start&&j<=end) {
					if(j<=n) {
						System.out.print(k++ +" ");
						
						
					}
					else if(j>n) {
						System.out.print(temp++ +" ");
					}
				
				}
				else {
					
					System.out.print("  ");
				}
			}
			System.out.println();
			start--;
			end++;
			tem-=dif;
			dif++;
		}
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
//	// reverse(n);
	// System.out.println(reducedDigit(n));
	 starPattern4(n);
	 

	}

}
