package functions;

public class NonStaticFunction {

	public static void main(String[] args) {

		NonStaticFunction ref = new NonStaticFunction();

		int add = ref.sum(10, 20);

		int add2 = ref.sum(30, 40);
		System.out.println(add + add2);
		
		int add3=Function1.sum(10, 20);
		System.out.println(add3);

	}

	public int sum(int a, int b) {
		return a + b;

	}
}