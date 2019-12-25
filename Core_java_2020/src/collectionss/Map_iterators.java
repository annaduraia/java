package collectionss;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map_iterators
{
    public static void main (String[] args)
    {
        HashMap<String, String> map = new HashMap<String, String> ();
        map.put ("1", "1 value");
        map.put ("2", "2 value");
        System.out.println ("Example 1...");
        // Map -> Set -> Iterator -> Map.Entry -> troublesome
        Iterator iterator = map.entrySet ().iterator ();
        while (iterator.hasNext ())
        {
            Map.Entry mapEntry = (Map.Entry) iterator.next ();
            System.out.println ("The key is: " + mapEntry.getKey () + ",value is :" + mapEntry.getValue ());
        }

        System.out.println ("Example 2...");
        // more elegant way
        for (Map.Entry<String, String> entry : map.entrySet ())
        {
            System.out.println ("Key : " + entry.getKey () + " Value : " + entry.getValue ());
        }
        System.out.println ("Example 3...");
        // weired way, but works anyway
        for (Object key : map.keySet ())
        {
            System.out.println ("Key : " + key.toString () + " Value : " + map.get (key));
        }

        Collection<String> collection = map.values ();
        Iterator<String> it = collection.iterator ();
        while (it.hasNext ())
        {
            System.out.println (it.next ());
        }
        List<String> list = Arrays.asList ("one Two three Four five six one three Four".split (" "));
        System.out.println (list);
        System.out.println ("max: " + Collections.max (list));
        System.out.println ("min: " + Collections.min (list));
    }
}
