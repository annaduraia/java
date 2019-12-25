package collectionss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_InsideList
{
    public static void main (String[] args)
    {
        List<String> arrList = new ArrayList<String> ();
        arrList.add ("arrList1");
        arrList.add ("arrList1");
        List<String> secList = new ArrayList<String> ();
        secList.add ("secList1");
        secList.add ("secList2");
        Map<Integer, List<String>> map1 = new HashMap<Integer, List<String>> ();
        map1.put (1, arrList);
        map1.put (2, secList);

        Iterator<Entry<Integer, List<String>>> iterator = map1.entrySet ().iterator ();
        while (iterator.hasNext ())
        {
            Entry<Integer, List<String>> entry = iterator.next ();
            System.out.println (entry.getKey () + "===" + entry.getValue ());
            List<String> resultList = new ArrayList<String> ();
            resultList = entry.getValue ();
            for (String string : resultList)
            {
                System.out.println (string);
            }
        }
        if (arrList.contains ("arrList1"))
            System.out.println ("tue");
    }
}
