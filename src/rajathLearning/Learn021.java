package rajathLearning;

import java.util.Scanner;

public class Learn021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter child");
		String father = sc.nextLine();
		
		
		
		switch (father) {
		case "Rajath, Siddarth":
			System.out.println("Basavaraj is Father");
		break;
		case "Sharath":
			System.out.println("Nagaraj is Father");
		break;
		case "Suhas, Veena":
			System.out.println("Mallikarjun is Father");
		break;
		case "Sharvani, Nidhi Shree":
			System.out.println("Manjunath is Father");
		break;
		default:
			System.out.println("Others");
		
		sc.close();
	
		
		}
	}

}
