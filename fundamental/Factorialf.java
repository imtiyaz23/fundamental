package fundamental;

import java.util.Scanner;

public class Factorialf {
	public static int factF(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
	
		return(fact);
	}
	
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int x=sr.nextInt();
		int r=sr.nextInt();
		
		int factx=factF(x);
		int factr=factF(r);
		int factnr=factF(x-r);
		int result=factx/(factr*factnr);
	   System.out.println(result);
		

	}

}
