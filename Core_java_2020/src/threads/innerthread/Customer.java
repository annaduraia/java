package threads.innerthread;

public class Customer {
	int amount = 0;
	int flag = 0;

	public synchronized int withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()	+ " is going to withdraw");

		if (flag == 0) {
			try {
				System.out.println("waiting....");
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed");
		return amount;
	}

	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()
				+ " is going to  deposit");
		this.amount += amount;

		notifyAll();
		System.out.println("deposit completed");
		flag = 1;
	}

}