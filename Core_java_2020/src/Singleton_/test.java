package Singleton_;

import static java.lang.System.*;

import java.util.Calendar;

public class test {
	
	public static void main(String[] args) {
		//SingletonObject object = new SingletonObject();
		SingletonObject singletonObject = SingletonObject.getInstance();
		
		try {
			SingletonObject duplicate = (SingletonObject)singletonObject.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	

}
