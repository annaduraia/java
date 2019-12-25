package collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String str[] = { "yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi", };
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : str) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		for (Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + "---" + e.getValue());

		}
	}
}
