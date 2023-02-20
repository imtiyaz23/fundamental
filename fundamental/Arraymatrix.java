package fundamental;

import java.util.Scanner;

public class Arraymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
	    int n=sr.nextInt();
		int m=sr.nextInt();
		int arr [][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sr.nextInt();
				System.out.println("array of element");
				System.out.println(arr[i][j]);
			}
			
			}
		
				
		}
		
		
	
		

	}


