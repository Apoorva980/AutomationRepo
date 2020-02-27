
public class SumOf100Numbers {

	public static void main(String[] args) {
		
		
		int total = 0;
		
		for (int i =1; i <=100; i++)
		{
			total = i + total;
		}
		
		System.out.println(total);
	}
}
