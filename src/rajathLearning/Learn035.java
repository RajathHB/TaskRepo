package rajathLearning;

import java.util.Scanner;

public class Learn035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		long fact = 1;
		
		int i = 1;
		while(i<=number) {
        fact = fact*i;
        i++;
        
		}
		System.out.println("fact is -> " +fact);
		
		sc.close();
		
	}

}
