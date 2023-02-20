package fundamental;

import java.util.Scanner;

public class stringFun {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		/*String str="coding";
		String 
		str1= " ninaja";
		System.out.println(str.concat(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.equals(str1));
		System.out.println(str.contains("ing"));
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.substring(0,3));
		String str2=s.nextLine();
		System.out.println(str2.length());*/
		String str=s.nextLine();
		String rev=" ";
		/*int count=1;
		for(int i =0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
			
			
			}

		System.out.println(count);*/
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
			//System.out.print(rev);
			
		}
		System.out.print(rev);
		if(str.equals(rev)) {
			System.out.println("palindrom");
		}
		
		
		

	}

}
