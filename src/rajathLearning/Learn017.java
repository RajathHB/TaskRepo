package rajathLearning;

import java.util.Scanner;

public class Learn017 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student marks");
		int Score = sc.nextInt();
		
		
		if (Score >= 90 && Score <=100) {
			System.out.println("Grade is A");
		}
		else if (Score >=80 && Score <=89) {
			System.out.println("Grade is B");
		}
		else if (Score >=70 && Score <=79) {
			System.out.println("Grade is C");
		}
		else if (Score >=60 && Score <=69) {
			System.out.println("Grade is D");
		}
		
		else {
			System.out.println("Grade is E");
		}
		
		sc.close();
		
	}

}
