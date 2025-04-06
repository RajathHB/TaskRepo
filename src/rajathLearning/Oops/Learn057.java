package rajathLearning.Oops;

import java.util.Scanner;

public class Learn057 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int i = sc.nextInt();
		
		if(isLeapyear(i)) {
			System.out.println(i + " is Leap Year");
		}
		else {
			System.out.println(i + " is not a Leap Year");
			sc.close();

		
		}
	}
	
	public static boolean isLeapyear(int i) {
		return((i%4 == 0 && i%100 != 0)	|| (i%400 == 0));
				

	}

}
