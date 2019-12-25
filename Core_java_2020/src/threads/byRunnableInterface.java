package threads;

/**
 * If you are not extending the Thread class,your class object would not be
 * treated as a thread object.So you need to
 * explicitely create Thread class object.We are passing the object of your
 * class that implements Runnable so that your
 * class run() method may execute.
 * 
 */
public class byRunnableInterface implements Runnable {

	public void run() {

		System.out.println("anna");
	}

	public static void main(String[] args) {
		byRunnableInterface interface1 = new byRunnableInterface();

		Thread thread = new Thread(interface1);

		thread.start();
	}
}
