package fundamental;

import java.util.Scanner;

public class Primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count=count+1;
			}
			if(count==2) {
				System.out.print(i);
		
					
		}
	
		}
	

			

	}

}
