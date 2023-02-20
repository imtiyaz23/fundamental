package fundamental;

import java.util.Scanner;

public class TotalSalay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sr= new Scanner(System.in);
        int basic_salary= sr.nextInt();
        char grade=sr.next().charAt(0);
        double Total_salary=0;
        if(grade=='A')
        {
        	Total_salary= basic_salary+1700+(.59*basic_salary);
        	
        }
        else 
        	if(grade=='B')
        {
        	
        	Total_salary=basic_salary+1500+(.59*basic_salary);
        	
        }
        else
        {
        	Total_salary=basic_salary+1300+(.59*basic_salary);
        	
        }
        System.out.println("Total salary=" +Total_salary);
        
	}

}
