package fundamental;


import java.io.*;
//Java program to print largest contiguous array sum
import java.util.*;

class StockBuySell
{
	public static void main (String[] args)
	{
		int [] a = {100, 90, 260, 310, 40, 535, 695};
	       ArrayList<ArrayList<Integer> >solution=stockBuySell(a, 7);
	       for(int i=0;i<solution.size();i++){
	       System.out.println(solution.get(i));
	       }
	}

	 static ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
     // code here
      ArrayList<ArrayList<Integer> > ans=new  ArrayList<ArrayList<Integer> >();
      int buy_index=0;
      for(int i=1;i<n;i++){
          ArrayList<Integer>list =new ArrayList<Integer>();
          if(arr[buy_index]<arr[i]){
             // ans.add((Integer)buy_index,(Integer)i);
             list.add(buy_index);
             list.add(i);
             ans.add(list);
              buy_index=i;
          }
          else if(arr[buy_index]>arr[i]) {
        	  buy_index=i;
          }
      }
      return ans;
 }
}

