package Singleton_;
public class SingletonObject{

	private static SingletonObject singletonObject;
	
	//1 private constructor
	private SingletonObject()
	{
	}
	
	//2 getinstance method to restrict duplicate object
	public  synchronized static SingletonObject getInstance()
	{
		if(null == singletonObject)
			singletonObject = new SingletonObject();
		return singletonObject;
	}
	//3 using clone method
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
	
}
