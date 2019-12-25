package threads.multi;

import threads.joinThreads;

public class mainMethod {

	public static void main(String[] args) {
		
		ther1 ther1 = new ther1();
		ther2 ther2 = new ther2();
		ther1.start();
		// if we use run ther1 will be treated as normal object not thread object.
		//ther1.run();
		
		joinThreads joinThreads1 = new joinThreads();
		joinThreads joinThreads2 = new joinThreads();
		joinThreads joinThreads3= new joinThreads();
		try{
			joinThreads1.join();
		}
		catch (InterruptedException exception){
			System.out.println(exception);
		}
		joinThreads2.start();
		joinThreads3.start();
	//	ther2.start();
		System.gc();
	}
}
