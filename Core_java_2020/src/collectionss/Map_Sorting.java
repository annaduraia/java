package collectionss;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Sorting
{
    public static void main (String[] args)
    {

        Map<String, String> unsortMap = new HashMap<String, String> ();
        unsortMap.put ("2", "B");
        unsortMap.put ("1", "A");
        unsortMap.put ("4", "D");
        unsortMap.put ("3", "B");
        unsortMap.put ("7", "C");
        unsortMap.put ("5", "z");
        unsortMap.put ("6", "b");
        unsortMap.put ("8", "a");

        System.out.println ("Unsort Map......");
        printMap (unsortMap);

        System.out.println ("Sorted Map......");
        Map<String, String> treeMap = new TreeMap<String, String> (unsortMap);
        printMap (treeMap);

    }

    public static void printMap (Map<String, String> map)
    {
        for (Map.Entry entry : map.entrySet ())
        {
            System.out.println ("Key : " + entry.getKey () + " Value : " + entry.getValue ());
        }
    }
}
