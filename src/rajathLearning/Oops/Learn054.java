package rajathLearning.Oops;

import java.util.Scanner;

public class Learn054 {

	public static void main(String[] args) {
		
		
		  int i = 0;
	        int flag = 0;
	        int m = 0;

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your number");
	        int n = sc.nextInt();

//	        17 -> 2 to 17/2 -> num%i == 0 -> not a prime
	//
	        m = n / 2;
	        if (n == 0 || n == 1) {
	            System.out.println("Not a prime -> " + n);
	        } else {
	            for (i = 2; i <= m; i++) {
	                if (n % i == 0) {
	                    System.out.println("Not a prime number");
	                    flag = 1;
	                    break;
	                }
	            }
	        }

	        if(flag ==0 ){
	            System.out.println("Prime Number" + n);
	        }
	        sc.close();

	}

}
