package rajathLearning;

import java.util.Scanner;

public class Learn037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		if (number <=1) {
			isPrime=false;}
		
		else {
		for (int i=2; i<=number/2; i++) {
			  if (number % i == 0) {
                  isPrime = false;
                  break;
              }
          }
      }

      if (isPrime) {
          System.out.println("Entered number is Prime");
      } else {
          System.out.println("Entered number is not Prime");
      }

      sc.close();
  }
}