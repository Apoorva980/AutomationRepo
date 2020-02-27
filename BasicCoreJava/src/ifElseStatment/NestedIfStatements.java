
	package ifElseStatment;

public class NestedIfStatements {
	
public static void main(String[] args) {
	
	int a =20;
	int b =30;
	int c =10;
	
	if (a>b)
	{
		if (a >c)
		{
			System.out.println (" a is greatest");
			
		}else {
			System.out.println ("c is greatest");
		}
	}
		else if  (b > c)
			
		{
			System.out.println("b is greatest");
		
	}else {
		System.out.println ("C is greatest");
			
	}
}
}