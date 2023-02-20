package fundamental;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int i;
	//int a=(x>y)?x:y;
	
	for( i=1;i<=x*y*z;i++) {
		if(i%x==0&&i%y==0&&i%z==0) 
			   break;
			
		}
	System.out.println(i);

}
}

