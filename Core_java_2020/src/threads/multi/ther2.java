package threads.multi;

public class ther2 extends Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e)

			{
				System.out.println(e);
			}

			System.out.println(i);

		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("durai anna");
		/**
		 * The sleep() method of Thread class is used to sleep a thread for the
		 * specified time.Syntax: Syntax of sleep() method:
		 * 
		 * The Thread class provides two methods for sleeping a thread:
		 * 
		 * • public static void sleep(long miliseconds)throws InterruptedException 
		 * • public static void sleep(long miliseconds, int
		 * nanos)throws InterruptedException
		 */
	}
}
