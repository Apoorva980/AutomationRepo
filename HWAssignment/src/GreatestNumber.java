
public class GreatestNumber {
	
	public static void main(String[] args) {
		
	int arr [] = new int [] {2,44,6,8,10, 12,14};
	
	int max = arr[0];
	
	for (int i =1; i <arr.length; i++) 
		
		if (arr[i] > max)
			max = arr[i];
		
		System.out.println("Largest in given array is" +max);
		
			
		
	}
	
	}


