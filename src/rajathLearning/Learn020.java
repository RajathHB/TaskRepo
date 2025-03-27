package rajathLearning;

import java.util.Scanner;

public class Learn020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter child");
		String user_input = sc.nextLine();
		
		
		switch (user_input) {
		 case "Rajath":
             System.out.println("You entered boy");
             break;
         case "Reshma":
             System.out.println("You entered girl");
             break;
         case "Kiran":
             System.out.println("You entered boy");
             break;
         case "Spoorthi":
             System.out.println("You entered girl");
             break;
         case "Vishal":
             System.out.println("You entered boy");
             break;
         case "Vibha":
             System.out.println("You entered girl");
             break;
         case "Vinay":
             System.out.println("You entered boy");
             break;
         case "Nayana":
             System.out.println("You entered girl");
             break;
         default:
             System.out.println("Invalid input");
             break;
     }
		
		
		
		
		
		
		
		
	sc.close();
	
		
	}

}
