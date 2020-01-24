package hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Coin1 implements CoinNote 
{
	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

class Note1 implements CoinNote 
{
	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}


  interface CoinNote { Integer getValue(); }
 
class Bag1<E> {
	 private static final int DEFAULT_CAPACITY = 10;
	 protected transient int modCount = 0;
	
	 private static int calculateCapacity(Object[] elementData, int minCapacity) {
	        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
	            return Math.max(DEFAULT_CAPACITY, minCapacity);
	        }
	        return minCapacity;
	    }
	 
	 private void grow(int minCapacity) {
	        // overflow-conscious code
	        int oldCapacity = elementData.length;
	        int newCapacity = oldCapacity + (oldCapacity >> 1);
	        if (newCapacity - minCapacity < 0)
	            newCapacity = minCapacity;
	        if (newCapacity - MAX_ARRAY_SIZE > 0)
	            newCapacity = hugeCapacity(minCapacity);
	        // minCapacity is usually close to size, so this is a win:
	        elementData = Arrays.copyOf(elementData, newCapacity);
	    }

	    private static int hugeCapacity(int minCapacity) {
	        if (minCapacity < 0) // overflow
	            throw new OutOfMemoryError();
	        return (minCapacity > MAX_ARRAY_SIZE) ?
	            Integer.MAX_VALUE :
	            MAX_ARRAY_SIZE;
	    }

	    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	    private void ensureCapacityInternal(int minCapacity) {
	        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
	    }

	    private void ensureExplicitCapacity(int minCapacity) {
	        modCount++;

	        // overflow-conscious code
	        if (minCapacity - elementData.length > 0)
	            grow(minCapacity);
	    }

	public Bag1() {
		 this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}

	@SuppressWarnings("rawtypes")
	//ArrayList list = new ArrayList();

	transient Object[] elementData;
	 private int size;
	 private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	@SuppressWarnings("unchecked")
	//public void add(CoinNote e) {
		// list.add(e.getValue());
	public void add(E e) {
		 ensureCapacityInternal(size + 1);  
		 elementData[size++] = e;
		/*
		 * if (e instanceof Coin1) { Coin1 coin = (Coin1) e; list.add(coin.getValue());
		 * } if (e instanceof Note1) { Note1 note = (Note1) e;
		 * list.add(note.getValue()); }
		 */

	}

	public void display() {
		for (Object object : elementData) {
			if(object!=null)
			System.out.println(((CoinNote)object).getValue());
		}
	}

}

public class Soln3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, val = 0;
		String str = "";
		n = sc.nextInt();
		Bag1<Coin1> bagOfCoins = new Bag1<Coin1>();
		Bag1<Note1> bagOfNotes = new Bag1<Note1>();
		for (int i = 0; i < n; i++) {
			str = sc.next();
			val = sc.nextInt();
			switch (str) {
			case "Coin":
				Coin1 coin = new Coin1();
				coin.setValue(val);
				bagOfCoins.add(coin);
				break;
			case "Note":
				Note1 note = new Note1();
				note.setValue(val);
				bagOfNotes.add(note);
				break;
			}
		}
		System.out.println("Coin:");
		bagOfCoins.display();
		System.out.println("Note:");
		bagOfNotes.display();
	}

}
