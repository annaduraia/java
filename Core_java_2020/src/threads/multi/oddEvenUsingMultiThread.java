package threads.multi;

import java.util.ArrayList;
import java.util.List;

public class oddEvenUsingMultiThread {

	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Thread oddThread = new Thread()
		{
			@Override
			public void run() {
				System.out.println("odd Are ");
				for (Integer integer : list) {

					 if(integer % 2 != 0 )
						 System.out.println(+integer);
				}
			}
		};
		Thread evenThread = new Thread()
		{
			@Override
			public void run() {
				System.out.println("Even Are ");
				for (Integer integer : list) {

					 if(integer % 2 == 0 )
						 System.out.println(+integer);
				}
			}
		}; 
		oddThread.start();
		try {
			oddThread.join();
		} catch (Exception e) {
		}
		evenThread.start();
	}
}
