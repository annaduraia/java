package pgm;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateUsingMap {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		String s= "annad";
		char a[] = s.toCharArray();
		System.out.println(a[1]);
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			
			if(map.containsKey(c)){
				 map.put(c, map.get(c)+1);
			 }else{
				 map.put(c, 1);			 
			 }
		}
		 for (Entry<Character, Integer> entry : map.entrySet()) {
			
			 System.out.println("Key :"+ entry.getKey() +" Value :" +entry.getValue());
			 System.out.println(entry.getValue().equals(1));
		}
		
	}
}
