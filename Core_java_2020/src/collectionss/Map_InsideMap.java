package collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_InsideMap
{
    public static void main (String[] args)
    {

        Map<String, Map<String, String>> outerMap = new HashMap<String, Map<String, String>> ();
        HashMap<String, String> innerMap = new HashMap<String, String> ();
        innerMap.put ("Inner Key 1", "Annadurai");
        innerMap.put ("Inner Key 2", "Rajiv");
        outerMap.put ("Outer Key", innerMap);
        // iterating first map
        Iterator<Entry<String, Map<String, String>>> iterator = outerMap.entrySet ().iterator ();
        while (iterator.hasNext ())
        {
            Entry<String, Map<String, String>> entry = iterator.next ();
            System.out.println (entry.getKey ());
            Map<String, String> internalMap = entry.getValue ();
            for (Map.Entry<String, String> entrySet : internalMap.entrySet ())
            {
                System.out.println (entrySet.getValue ());
                System.out.println (entrySet.getKey ());
            }
        }
    }
}
