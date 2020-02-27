package function;

public class function3 {
	
	public static void main(String[] args) {
		
	
	String a = eligibility (80) ;
	
	
	System.out.println (a);

	
	
}

public static String eligibility (int age) {

if (age >=18 && age <=55)
	return "you are eligible";
else
	return "you are not eligible";
}

}