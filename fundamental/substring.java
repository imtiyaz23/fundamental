package fundamental;
import java.util.Arrays;

public class substring {
	

	public static void main(String[] args) {
	String str="Welcome";

	//for(int i=0;i<str.length();i++) {
		//for(int j=i;j<str.length();j++) {
			//System.out.println(str.substring(i,j+1));
			 
		//}
		//System.out.println(str.substring(i,j+1));
	//}
	str=str.toLowerCase();
	System.out.println(str.length());
     char[]ch1=str.toCharArray();
     System.out.println(ch1);
   Arrays.sort(ch1);
   System.out.print("sort array=" +Arrays.toString(ch1));
   
	}

}
