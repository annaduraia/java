package Exceptions.over;

public class overriding extends student {
	public void msg() throws ArithmeticException {
		System.out.println("par");
	}

	public static void main(String[] args) {

		student over = new overriding();
		// overriding overriding = new student();
		// overriding.msg();
		over.msg();
	}
}
