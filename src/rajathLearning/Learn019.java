package rajathLearning;

import java.util.Scanner;

public class Learn019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side1, side2, side3");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		if((side1 == side2) && (side2 == side3) && (side1 == side3)) {
			System.out.println("Triangle is Equilateral");
		}
		else if((side1 == side2) || (side2 == side3) || (side1 == side3)){
			System.out.println("Triangle is Isocelous");
		}
		else
		{
			System.out.println("Triangle is Scalene");
		}
		
		
		sc.close();
		
		
		
	}

}
