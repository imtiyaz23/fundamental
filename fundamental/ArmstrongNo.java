package fundamental;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n =s.nextInt();
      int z=n;
      int count=0;
      while(z>0)
      {
    	  count=count+1;
    	  z=z/10;
      }
      //System.out.print(count);
      z=n;
      while(z>0)
      {
    	  int digit=z%10;
    	  int prod=1,sum=0;
    	  
    	  for(int i=1;i<=count;i++)
    		  prod=prod*count;
    	  sum=sum+prod;
    	  System.out.print(sum);
      }
	}

}
