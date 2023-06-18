import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class RotationString {
	
	public static boolean Anagram(String str1,String str2) {
		if(str1.length()!=str2.length())return false;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
			}
			else {
				map.put(str1.charAt(i), 1);
			}
		}
		for(int i=0;i<str2.length();i++) {
			if(map.containsKey(str2.charAt(i))) {
				if(map.get(str2.charAt(i))==0) {
					return false;
				}
				else {
					map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
				}
				
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	public static boolean AreRotation(String str1,String str2) {
		if(str1.length()!=str2.length())return false;
		boolean flag =true;
		String temp=str1+str1;
		for(int i=0;i<str2.length();i++)
		{
			 flag =true;
			for(int j=0;j<str2.length();j++) {
				if(str2.charAt(j)!=temp.charAt(i+j)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				return true;
			}
		}
//		
		return flag;
	}
	

	public static void main(String[] args) {
		
//		String str1="a";
//		String str2="";
//		System.out.println(Anagram(str1, str2));
		 BigInteger dividend = new BigInteger("9999999999999999");
	        BigInteger divisor = new BigInteger("9");
	      
	        
	        BigInteger remainder = dividend.mod(divisor);
	        System.out.println(remainder);
		
		
		
	}

}
