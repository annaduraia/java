package Exceptions;

public class AppExceMain2 {
	private static int i;

	public static void main(String[] args) {
		try {
			wrongMethod();
			i = 1 / 0;
			System.out.println("Try");
		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	public static  void wrongMethod() {
		System.out.println("wrongMethod");
		throw new Error();
	}

}
