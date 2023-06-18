
public class SortingString {
	public static String insertionSort(String str) {
		char ch[]=str.toCharArray();
		for(int i=1;i<ch.length;i++) {
			char temp=ch[i];
			 // char temp=str.charAt(i);
			int j=i-1;
			while(j>=0 && ch[j]>temp) {
				ch[j+1]=ch[j];
				
				j--;
			}
			ch[j+1]=temp;
		}
		return new String(ch);
	}
	public static String Sorting(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=0;j<ch.length-i-1;j++) {
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
				
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
	String str="md imtiyaz alam";
	System.out.println(insertionSort(str));
			
   
	}

}
