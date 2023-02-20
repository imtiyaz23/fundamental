package fundamental;

public class CountLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=2022;i++) {
			if((i%400==0)||(i%4==0&&i%100!=0)) {
				count++;
				System.out.println(i+" "+count);
			}
			
		}
		//System.out.println(count);

	}

}
