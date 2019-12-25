package pgm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class mapSwap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<String, Integer> revMap = new HashMap<String, Integer>();
		
		map.put(1, "value");
		map.put(2, "value2");

		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "---" + entry.getValue());
			revMap.put(entry.getValue(), entry.getKey());
		}
		Iterator<Entry<String, Integer>> revIterator = revMap.entrySet().iterator();
		while (revIterator.hasNext()) {
			Entry<String, Integer>entry1 =revIterator.next();
			System.out.println(entry1.getKey()+"---"+entry1.getValue());
		}
	}

}
