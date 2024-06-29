

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class displayage {

	public static void main(String[] args) throws Exception {
		
		
		

		
		LocalDate dob = LocalDate.parse("2001-05-05");
                LocalDate currDate = LocalDate.now();
                 		
		Period period = Period.between(currDate, dob);

		int dobYear = Math.abs(period.getYears());
		
		System.out.print(dobYear);

		
                
                
	}

}

