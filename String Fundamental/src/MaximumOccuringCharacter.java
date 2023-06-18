import java.util.HashMap;

public class MaximumOccuringCharacter {
	static char getMaxChar(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		   char maxChar = '\0';
	        int maxCount = 0;
	        for(HashMap.Entry<Character,Integer> entry: map.entrySet()) {
	        	if(entry.getValue()>maxCount) {
	        		maxChar=entry.getKey();
	        		maxCount=entry.getValue();
	        	}
	        }
	        return maxChar;
	}

	public static void main(String[] args) {
		String str="my imtiyaz";
		
		System.out.println(getMaxChar(str));

	}

}
