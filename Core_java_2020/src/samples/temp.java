package samples;

import java.awt.DisplayMode;

public class temp {

	public static void main(String[] args) {
		try {
			disp();
			System.out.println("Main");
		}  
		catch (Exception e) {
			System.out.println("Exce");
		}
			finally {
			System.out.println("F");
		}
	}

	public static void disp() {
		throw new RuntimeException();
	}

}
