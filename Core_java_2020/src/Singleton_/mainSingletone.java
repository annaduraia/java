package Singleton_;

import java.util.Calendar;

public class mainSingletone {

	public static void main(String[] args) {
 
		//Singleton singleton = new Singleton();
		
		Singleton singleton = Singleton.getInstance();
		Calendar calendar = Calendar.getInstance();
	}

}
