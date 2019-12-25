package collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_KeyValueSwap
{
    public static void main (String[] args)
    {
        Map<Integer, String> map = new HashMap<Integer, String> ();
        Map<String, Integer> revMap = new HashMap<String, Integer> ();
        map.put (1, "Annadurai");
        map.put (2, "RajivGandhi");
        Iterator<Entry<Integer, String>> iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ())
        {
            Entry<Integer, String> entry = iterator.next ();
            System.out.println ("Key is :" + entry.getKey () + "----- Value is :" + entry.getValue ());
            revMap.put (entry.getValue (), entry.getKey ());
        }
        System.out.println ("--------------After Swap---------------");
        Iterator<Entry<String, Integer>> revIterator = revMap.entrySet ().iterator ();
        while (revIterator.hasNext ())
        {
            Entry<String, Integer> entry1 = revIterator.next ();
            System.out.println ("Key is :" + entry1.getKey () + "------ Value is :" + entry1.getValue ());
        }
    }
}
