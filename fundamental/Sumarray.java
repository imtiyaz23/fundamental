package fundamental;
import java.util.Scanner;

public class Sumarray {
	public static int sum(int arr[],int n) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
	
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
	      int ans= sum(arr,n);
	      System.out.println(ans);
	       
	  
	}

}
