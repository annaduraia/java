package Singleton_;

public class Singleton {

	private static Singleton singleton;
	private Singleton() {

	}
	public static synchronized  Singleton getInstance() {
		if (null != singleton)
			singleton = new Singleton();
		return singleton;
	}
	
	public Object clone () throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
