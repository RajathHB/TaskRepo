package rajathLearning;

import java.util.Scanner;

public class Learn045_Leap {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Year");
	int Year = sc.nextInt();
	
   if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
	   System.out.println("Leap Year");
   }
   else {
	   System.out.println("Not a Leap Year");
   }

    
		
		
		
	sc.close();
	
	}

}
