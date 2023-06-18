
public class RemoveCharacters {
	public static int factorial(int n) {
		if(n==0)return 1;
		return n*factorial(n-1);
	}
	
 public static String RemoveChars(String first,String Second) {
	 String result="";
	 for(char c: first.toCharArray()) {
		 if(Second.indexOf(c)==-1) {
			 result=result+c;
		 }
	 }
	 return result;
 }
	public static void main(String[] args) {
//		String first="india is great";
//		String second="in";
//		System.out.println(RemoveChars(first, second));
		 int n=4;
		// int j;
		 for(int i=0;i<=n;i++) 
		 {
			 for( int j=0;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=0;j<=i;j++) {
				 if(i!=n) {
					 if(j==0||j==i) {
							System.out.print(" "+factorial(i)/(factorial(i-j)*factorial(j))); 
						 }
						 else {
							 System.out.print("  ");
						 }
				 }
				 else {
					 System.out.print(" "+factorial(i)/(factorial(i-j)*factorial(j))); 
				 }
			 }
			 System.out.println();
		 }
		   
		  
		

	}

}
