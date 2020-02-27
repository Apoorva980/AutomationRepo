package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	AccessModifiers obj = new AccessModifiers ();
	
	obj.publicfunction();
	}

	public void publicfunction() // they all are non static
	{
	System.out.println("public function");	
	}
	
	private void privatefunction()
	
	{
		System.out.println("private function");
	
	}
	
	void noAccessModFunc()
	
	{
		System.out.println("No access Modifiers function");
	
	}
	
	protected void protectedFunction()
	
	{
		System.out.println("protected function");
		
		
	}
}

