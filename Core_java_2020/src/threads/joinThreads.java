package threads;

public class joinThreads extends Thread{

	/**
	 * The join() method waits for a thread to die. In other words, it causes
	 * the currently running threads to stop executing until the thread it joins
	 * with completes its task.
	 */

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException exception)
			{
				
			}
			System.out.println(i);
		}
	}
}
