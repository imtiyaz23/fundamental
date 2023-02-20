package fundamental;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     int n=s.nextInt();
     int count=0;
     int z=n;
     int i=1;

     while(i<=n)
     {
    	 if(n%i==0) {
    		 count=count+1;
    	 }
    	 i++;
    	 
     }
     if(count==2)
     {
    	 System.out.print("prime no");
    	 
     }
     else {
    	 System.out.print("not prime no");
     }
     
      
    
	}

}
