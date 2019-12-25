package collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class List_ArrayDuplicate {
 
	public static void main(String[] args) {

	    /**
	     * String Rev
	     */
		String str1="rajiv";
		for (int i = str1.length()-1; i >=0 ; i--) {
			System.out.println("---"+str1.charAt(i));
		}
		
		/**
		 * List Duplicate
		 */
		int intArray[] = { 5, 1, 2, 3, 4, 5, 3, 2 };
		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : intArray) {
		    System.out.println ("List of Values: "+integer);
			if(list.contains(integer))
			{
				System.out.println("Duplicate :"+integer);
			}
			else
			{
				list.add(integer);
			}
		}
		
		/**
		 * Set Duplicate
		 */
        String[] strArr = {"one","two","three","four","four","five"};
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }
        
//		Map<Integer, Integer> nwmap = new HashMap<Integer, Integer>();
//
//		for (int i = 0; i < intArray.length; i++) {
//
//			Integer key = intArray[i];
//			if (nwmap.get(key) != null && nwmap.containsKey(key)) {
//
//				val += " Duplicate: " + String.valueOf(key) + "\n";
//
//			} else {
//				nwmap.put(key, c);
//				c++;
//			}
//		}
//		System.out.println(val);

		// int array[] = {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};
		//
		// HashMap<Integer,Integer> duplicates = new HashMap<Integer,Integer>();
		// for(int i=0; i<array.length; i++)
		// {
		// if(duplicates.containsKey(array[i]))
		// {
		// int numberOfOccurances = duplicates.get(array[i]);
		// duplicates.put(array[i], (numberOfOccurances + 1));
		// }else{
		// duplicates.put(array[i], 1);
		// }
		// }
		// Iterator<Integer> keys = duplicates.keySet().iterator();
		// System.out.print("Duplicates : " );
		// while(keys.hasNext())
		// {
		// int k = keys.next();
		// if(duplicates.get(k) > 1)
		// {
		// System.out.print(" "+k);
		// }
		// }
	}

}
