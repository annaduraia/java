import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); for(int t
		 * = 0; t < n; t++) { int a = sc.nextInt(); int b = sc.nextInt();
		 * System.out.println(a+b); }
		 */
		/*
		 * String res = findNumber(arr , 3); System.out.println(res);
		 */

		/*arr = oddNumbers(2, 5);
		System.out.println("anna " + arr);*/
		
		String s = firstRepeatingLetter("anannnna");
		System.out.println(s);
	}

	public static String firstRepeatingLetter(String s) {
	    // Write your code here
	        char[]arr = s.toCharArray();
	        //HashSet<Character> set = new HashSet<>();
	        char maxKey = ' ';
	        int maxVal = 0;
	        
	        	Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=0; i<arr.length-1; i++){
	            char c = arr[i];
	            if(map.containsKey(c)){
	            	
	            	int val=map.get((c))+1;
	            	map.put(c, map.get((c))+1);
	            	if (maxVal < val)
	            	{	            		
	            		maxVal = val;
	            		maxKey = c;
	            		//return String.valueOf(val);
	            	}
	            	map.put(c, val);
	            	
	               // return String.valueOf(c);
	            }else{
	                map.put(c, 1);
	                if (maxVal < 1)
	                {
	                	maxVal = 1;
	                	maxKey = c;
	                }
	            }
	        }
		
		System.out.println("Key " + String.valueOf(maxKey) + "val " + maxVal ); ///Result
		
		//Map<Character, Integer> treeMap = new TreeMap<Character, Integer>(map);
		
		/*List<Map.Entry<K, V>> list
		Collections.sort(list, new Comprator());*/
		
		
		for (Entry<Character, Integer> entry : map.entrySet ())
        {
            System.out.println ("Key -: " + entry.getKey () + " Value -: " + entry.getValue ());
        }
		
		/*for (Entry<Character, Integer> entry : map.entrySet ())
        {
            System.out.println ("Key : " + entry.getKey () + " Value : " + entry.getValue ());
            //System.out.println(" : "+String.valueOf(entry.getKey ()));
            return String.valueOf(entry.getKey ());
        }*/
		return null;
}
	
	static List<Integer> oddNumbers(int l, int r) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =l ;i<r+1;i++){
			if (l % 2 != 0) {
				list.add(l);
			}
			l++;
		}
		return list;
	}

	static String findNumber(List<Integer> arr, int k) {
		if (arr.contains(k)) {
			return "YES";
		} else {
			return "NO";
		}

	}
}
