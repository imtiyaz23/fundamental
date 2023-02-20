package fundamental;

import java.util.Scanner;

public class removeConsective {
	public static String removeCon(String str) {
		System.out.println(str.length());
		String str1="";
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				str1+=str.charAt(i);
			}
		}
		str1=str1+str.charAt(str.length()-1);
		return str1;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String str2=removeCon(str);
		System.out.println(str2);
		
		

	}

}
