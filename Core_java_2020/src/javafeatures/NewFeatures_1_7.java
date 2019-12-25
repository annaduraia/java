package javafeatures;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewFeatures_1_7 {

	public static void main(String[] args) {

		// 1)Type inference
		Map<String, List<String>> employeeRecords = new HashMap<>();
		List<Integer> primes = new ArrayList<>();
		// 2) String in Switch
		String state = "NEW";
		switch (state) {
		case "NEW":
			System.out.println("Order is in NEW state");
			break;
		case "CANCELED":
			System.out.println("Order is Cancelled");
			break;
		case "REPLACE":
			System.out.println("Order is replaced successfully");
			break;
		case "FILLED":
			System.out.println("Order is filled");
			break;
		default:
			System.out.println("Invalid");
		}

		// 3) Underscore in Numeric literals
		int billion = 1_000_000_000;
		long creditCardNumber = 1234_4567_8901_2345L;
		long ssn = 777_99_8888L;
		double pi = 3.1415_9265;
		float pif = 3.14_15_92_65f;

		// 4) Catching Multiple Exception Type in Single Catch Block
		try {
			System.out.println("Hi");
		} 
		//catch (ClassNotFoundException | ArrayIndexOutOfBoundsException ex) {
			//ex.printStackTrace();
		//}
		finally{
			
		}

	}
}
