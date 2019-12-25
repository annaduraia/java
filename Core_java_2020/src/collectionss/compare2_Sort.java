package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compare2_Sort implements Comparator<Integer> {
	final int before = -1;
	final int equal = 0;
	final int after = 1;

	@Override
	public int compare(Integer int1, Integer int2) {

		
		if (int1 % 2 == 0 && int2 % 2 != 0) { // +-
			return after;
		} else if (int1 % 2 != 0 && int2 % 2 == 0) { // -+
			return before;
		} else if (int1 % 2 == 0 && int2 % 2 == 0) { // ++

			return int1.compareTo(int2);
		} else if (int1 % 2 != 0 && int2 % 2 != 0) { // --

			return int2.compareTo(int1);
		}
		return equal;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(99);
		list.add(1);
		list.add(11);
		list.add(172);
		list.add(14);
		System.out.println("Un Sort"+list);
		Collections.sort(list, new compare2_Sort());
		System.out.println("After Sort With odd or even"+list);
	}

}
