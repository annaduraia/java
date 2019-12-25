package samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapSamples {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("anna", 1);
		map.put("durai", 2);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		//possible to add duplicate
		List<String> list = new ArrayList<String>();
		list.add("aaaaa");
		list.add("aaaaa");
		list.add("aaaaalist.add;");
		for (String string : list) {
			System.out.println(string);
		}
		// Not possible to add duplicate
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		 
	}
}
