package javafeatures;

import java.util.ArrayList;
import java.util.List;

interface phone{
	void call();
	default void message(){
		System.out.println("Message");
	}
	
}
class AndroidPhone implements phone{

	public void call() {
		System.out.println("call");
	}

}
public class NewFeatures_1_8 {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.forEach(i -> System.out.println(i));
		
		phone p = new AndroidPhone();
		p.message();
		p.call();
		
		
		Runnable r = new Runnable(){
		@Override
		public void run() {
			System.out.println("My Runnable");
		}};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = () -> {
			System.out.println("My Runnable 1.8");
		};		
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
