package rajathLearning;

import java.util.Scanner;

public class Learn026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int A = sc.nextInt();
		
		switch (A%2) {
		case 0:
		System.out.println("This is Even Number");
		break;
		
		case 1:
		System.out.println("This is Odd Number");
		break;
		
		default:
	    System.out.println("Invalid Input");
	    
		
		}
		
		sc.close();
		
		
	}

}
