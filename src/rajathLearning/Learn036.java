package rajathLearning;

import java.util.Scanner;

public class Learn036 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		long fact = 5;
		
		for (int i = 1; i<=number; i++) {
			fact = fact * i;
		}
			System.out.println("fact is -> " + fact);
		
		sc.close();
		
	}

}
