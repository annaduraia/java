package threads.innerthread;

public class SynMethod {
	public static void main(String[] args) {
		final Customer c=new Customer();
		
		Thread t1=new Thread(){
			public void run(){
				c.withdraw(5000);
				System.out.println("After withdraw amount is"+c.amount);
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				c.deposit(9000);
				System.out.println("After deposit amount is "+c.amount);
			}
		};
		t1.start();
		t2.start();
	}
	}