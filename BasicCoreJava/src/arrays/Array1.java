package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[12];

		arr[0] = "Apoorva";
		arr[1] = "Sneha";
		arr[2] = "Pallavi";
		arr[3] = "Prachi";
		arr[4] = "Harshal";
		arr[5] = "Sachin";
		arr[6] = "Abhishek";
		arr[7] = "Yogesh";
		arr[8] = "Deepika";
		arr[9] = "Varsha";
		arr[10] = "Rani";
		arr[11] = "kalyani";

		
		 int i =0;
		  
		  while (i <= 11) { System.out.println(arr[i]); i++; }
		 

		/*
		 * for (int i =0; i<arr.length; i++) { System.out.println(arr[i]); }
		 * 
		 * }
		 */

		// Enhanced for loop

		/*for (String var : arr)

		{
			System.out.println(var);

		} */
	}

}
