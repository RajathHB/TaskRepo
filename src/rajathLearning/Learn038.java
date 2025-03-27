package rajathLearning;

import java.util.Scanner;

public class Learn038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
	
		boolean isLeap = true;

	
		 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            isLeap = true;
		 }
	
	else
	{
		
		isLeap = false;
	}

    if (isLeap) {
        System.out.println("Entered year is Leap");
    } else {
        System.out.println("Entered year is not Leap");
    }

	
	sc.close();
	
	}

}
