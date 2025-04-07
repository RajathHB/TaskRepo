package rajathLearning.Oops;

public class Learn058_Rev {

	public static void main(String[] args) {
		
		String str = "RAJATH";
		String rev = "";
		int l = str.length();
		
		for (int i=l-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		
		}
		
		System.out.println("Reverse of the Entered String is " + rev);

		
	}

}
