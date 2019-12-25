package threads;

public class threadSample extends Thread{

	public void run(){
		System.out.println("Thread Running");
	}
	public static void main(String[] args) {
		threadSample sample = new threadSample();
		sample.start();
	}
	/**
	 * Threading is a facility to allow multiple tasks to run concurrently within a single process. Threads are independent, concurrent execution through a program, and each thread has its own stack.
In Java threads can be implemented in two ways. One is by 'Extending Thread Class' and the other way is by 'Implementing Runnable Interface'
Extending Thread Class is required to 'override run()' method. The run method contains the actual logic to be executed by thread.
Creation of thread object never starts execution, we need to call 'start()' method to run a thread. Examples gives you more details. Other methods supported by Threads are given below.
join(): It makes to wait for this thread to die. You can wait for a thread to finish by calling its join() method.
sleep(): It makes current executing thread to sleep for a specified interval of time. Time is in milli seconds.
yield(): It makes current executing thread object to pause temporarily and gives control to other thread to execute.
notify(): This method is inherited from Object class. This method wakes up a single thread that is waiting on this object's monitor to acquire lock.
notifyAll(): This method is inherited from Object class. This method wakes up all threads that are waiting on this object's monitor to acquire lock.
wait(): This method is inherited from Object class. This method makes current thread to wait until another thread invokes the notify() or the notifyAll() for this object.
	 */
}
