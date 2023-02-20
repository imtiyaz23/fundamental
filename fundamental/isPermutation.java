package fundamental;

import java.util.Arrays;
import java.util.Scanner;

public class isPermutation {
	public static boolean isPermutation(String str1,String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2) {
			return false;
		}
		char []ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println("sort array="+Arrays.toString(ch1));
		System.out.println("sort array2="+Arrays.toString(ch2));
		for(int i=0;i<n1;i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		boolean ans=isPermutation(str1,str2);
		System.out.println(ans);
		}
		

	}


