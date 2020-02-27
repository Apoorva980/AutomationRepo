package exceptionhandling;

public class ExceptionType1 { // Unchecked Exception
	
	static ExceptionType1 e ;
	
	public static void main (String [] args) {
		

		
		
		//Exception 1
		
		System.out.println(10/2);
		
		
		//Exception 2
		String name ="Apoorva";
		System.out.println(name.charAt (0));
		
		//Exception 3
		e.sum(10, 30);
	}

	public void sum(int a, int b)
	
	{
		System.out.println(a+b);
	}
	
}
