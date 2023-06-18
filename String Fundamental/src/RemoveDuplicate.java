import java.util.HashSet;

public class RemoveDuplicate {
	static String Unique(String str) {
		HashSet<Character> set=new HashSet<>();
		String result="";
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				result=result+str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str="my name is Imtiyaz alam";
		str=str.toLowerCase();
		System.out.println(Unique(str));

	}

}
