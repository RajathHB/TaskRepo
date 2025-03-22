package rajathLearning;

import java.util.Scanner;

public class Learn015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a,b");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
		System.out.println("Max is " +a );
		}
		else {		
		System.out.println("Max is " +b );
		
		
	}
		sc.close();
}
}