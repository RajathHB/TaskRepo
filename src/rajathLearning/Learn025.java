package rajathLearning;

import java.util.Scanner;

public class Learn025 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X");
		double X = sc.nextDouble();
		System.out.println("Enter Y");
		double Y = sc.nextDouble();
		System.out.println("Enter Z");
		double Z = sc.nextDouble();
		
		double result;
		
		result = Math.cbrt(Math.pow(X, 2) + Math.pow(Y, 2) - Math.abs(Z));
		System.out.println(result);
		
		sc.close();
		
		
	}

}
