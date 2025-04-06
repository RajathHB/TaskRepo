package rajathLearning.Oops;

import java.util.Scanner;

public class Learn056_PPrime {

	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	int num = sc.nextInt();
	
	//boolean result = isPrime(num);
	
	if(isPrime(num)) {
		System.out.println(num + " is Prime Number");
	}
	else {
		System.out.println(num +  " is not Prime Number");
	}
	
	
	
	
	
	
	sc.close();
	}

	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2; i<=Math.sqrt(num); i++)
	    if(num%i == 0); return false;
	}
}
