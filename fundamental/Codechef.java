//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//    public static int gcd(int a,int b){
//        int min=Math.min(a,b);
//        int ans=1;
//        for(int i=2;i<=min;i++){
//            if(a%i==0&&b%i==0){
//                ans=i;
//            }
//        }
//        return ans;
//    }
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		// your code goes here
//		Scanner sc=new Scanner(System.in);
//		int test=sc.nextInt();
//		
//		while (test>0){
//		    test--;
//		    int n=sc.nextInt();
//		    int []arr=new int[n];
//		    //int []res=new int[n];
//		    for(int i=0;i<n;i++){
//		        arr[i]=sc.nextInt();
//		    }
//		   for(int i=0;i<n-1;i++){
//		       if(arr[i]!=arr[i+1]){
//		           int temp=gcd(arr[i],arr[i+1]);
//		           if(arr[i]>arr[i+1]){
//		               arr[i]=temp;
//		           }
//		           else{
//		               arr[i+1]=temp;
//		               i++;
//		           }
//		       }
//		   }
//		   int tem=gcd(arr[n-2],arr[n-1]);
//		   arr[n-1]=tem;
//		   int sum=0;
//		   for(int i=0;i<n;i++){
//		       sum+=arr[i];
//		   }
//		   System.out.println(sum);
//		    
//	}
//	}
//}