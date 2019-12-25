package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("resource")
public class SerializationInheritanceDemo {

	/**
	 * http://learnfromexamples.com/java-serialization-with-inheritance/
	 * 
	 * What happens when a class is serializable but its superclass is not ?
	 * 
	 * Serialization: At the time of serialization, if any instance variable is
	 * inheriting from non-serializable superclass, then JVM ignores original
	 * value of that instance variable and save default value to the file. De-
	 * Serialization: At the time of de-serialization, if any non-serializable
	 * superclass is present, then JVM will execute instance control flow in the
	 * superclass. To execute instance control flow in a class, JVM will always
	 * invoke default(no-arg) constructor of that class. So every
	 * non-serializable superclass must necessarily contain default constructor,
	 * otherwise we will get runtime-exception.
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Son son = new Son();
		son.child = 11;
		son.parent = 21;
		System.out.println("Serialization Starts");
		FileOutputStream fileOutputStream = new FileOutputStream("inheritance.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(son);

		System.out.println(son.child);
		System.out.println(son.parent);

		System.out.println("DeSerialization Starts");
		FileInputStream fileInputStream = new FileInputStream("inheritance.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Son son1 = (Son) inputStream.readObject();

		System.out.println(son1.child);
		System.out.println(son1.parent);
	}

	/*
	 * Instance Block.... Father <span id= class Constructor span... Son
	 * Constructor... Serialization Starts DeSerialization Starts 11 21
	 */
}