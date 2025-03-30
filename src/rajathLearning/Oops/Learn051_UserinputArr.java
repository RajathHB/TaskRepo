package rajathLearning.Oops;

import java.util.Scanner;

public class Learn051_UserinputArr {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of an Array");
		int a = sc.nextInt();
		int [] int_array = new int[a];
		
		
		
		
		System.out.println("Enter the elemenyts");
		for (int i=0; i<a; i++) {
			int_array[i] = sc.nextInt();
		
		}
		System.out.println("______________");
		
		for (int i=0; i<a; i++) {
			System.out.println(int_array[i]);
		}
		
		
		

		
		
	sc.close();	
	}

}
