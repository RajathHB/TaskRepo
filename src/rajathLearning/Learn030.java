package rajathLearning;

import java.util.Scanner;

public class Learn030 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		for (int i=0; i<=a; i++) {
		if (i%2 == 0) {
			System.out.println(i+ "-> is even");
			
		}
		else {
			System.out.println(i+ "-> is odd");
		}
		
		}
		sc.close();

	}
}
