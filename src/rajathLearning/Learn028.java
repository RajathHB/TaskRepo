package rajathLearning;

import java.util.Scanner;

public class Learn028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(result);
		
		sc.close();
		
				
	
	
	
	}

}
