package function;

public class NonStaticFunction {

	
	public static void main(String[] args) {
		
		NonStaticFunction ref = new NonStaticFunction ();
		
		int add = ref.sum(10,30);
		
		int add1 = ref.sum (50,40);

		
		System.out.println(add+add1);
		
		int add3 = function1.sum(40, 50);
		System.out.println(add3);
	}

	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a +b;
	}
}
