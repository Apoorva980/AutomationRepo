package arrays;

public class Array3 {
	
public static void main(String[] args) {
	
	int arr [] = {10,20,990,40,50,60,70,80,90};
			
	 	int i;
	 	
	 	int max = arr [0];
	 	
	 	
	 	for (i=1; i<arr.length; i++)
	 		if (arr [i] > max)
	 			max = arr [i];
	 	
	 	System.out.println("largest number is " + max);
	
	
}
}
