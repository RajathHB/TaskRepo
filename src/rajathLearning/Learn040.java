package rajathLearning;

public class Learn040 {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		int arr2[]= {1, 2, 3, 4, 5};
		System.out.println(arr == arr2);
		
		// because arrays is stored in different loc. Hence arr is not same as arr2
		
		int[] arr3 = arr;
		
		System.out.println(arr == arr3);
		
		//Here comparision between arr and arr3 will be true because above we assigned arr3 as arr
		
		System.out.println(arr.equals(arr2));
		//Then also it is false because only in case of string we compare values but incase of arrays we dont compare values
		
		
		
	}

}
