package exceptionhandling;

public class HandleException {

	public static void main(String[] args) {

		try { // Exception 1

			System.out.println(10 / 2);

			// Exception 2
			String name = "Apoorva";
			System.out.println(name.charAt(0));

			//ExceptionType1.e.sum(10, 30);// static method can be called by class name and e is an object and static type

		} catch (ArithmeticException e) {

			System.out.println("Recovery1");

		} catch (StringIndexOutOfBoundsException e1) {

			System.out.println("Recovery2");
		}

		catch (Exception e) {
			System.out.println("Recovery 3");
		}finally
		{
			System.out.println("Finally");
		}

		System.out.println("Apoorva");

	}
}
