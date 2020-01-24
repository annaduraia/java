package hack;

import java.util.ArrayList;
import java.util.Scanner;

class Coin //implements CoinNote 
{
	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

class Note //implements CoinNote 
{
	Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

/*
 * interface CoinNote { Integer getValue(); }
 */
class Bag<E> {

	@SuppressWarnings("rawtypes")
	ArrayList list = new ArrayList();

	@SuppressWarnings("unchecked")
	//public void add(CoinNote e) {
		// list.add(e.getValue());
	public void add(E e) {
		if (e instanceof Coin) {
			Coin coin = (Coin) e;
			list.add(coin.getValue());
		}
		if (e instanceof Note) {
			Note note = (Note) e;
			list.add(note.getValue());
		}

	}

	public void display() {
		for (Object object : list) {
			System.out.println(object.toString());
		}
	}

}
/*
 7
Note 83
Coin 19
Coin 85
Note 8
Note 30
Coin 56
Coin 53
 */
public class Soln2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, val = 0;
		String str = "";
		n = sc.nextInt();
		Bag<Coin> bagOfCoins = new Bag<Coin>();
		Bag<Note> bagOfNotes = new Bag<Note>();
		for (int i = 0; i < n; i++) {
			str = sc.next();
			val = sc.nextInt();
			switch (str) {
			case "Coin":
				Coin coin = new Coin();
				coin.setValue(val);
				bagOfCoins.add(coin);
				break;
			case "Note":
				Note note = new Note();
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
