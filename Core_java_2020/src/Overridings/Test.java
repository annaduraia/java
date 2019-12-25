package Overridings;

class Test extends ABC {
	
	public static void disp() {
		System.out.println("disp() method of Child class");
	}

	public void xyz() {
		System.out.println("xyz() method of Child class");
	}
	public void abc()
	   {
	      System.out.println("abc() method of Child class");
	 }
	 
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		// Parent class reference to child class object
		ABC obj = new ABC();
		//Test obj1 = new Test();
		obj.disp();
		//obj.abc();
	}
}